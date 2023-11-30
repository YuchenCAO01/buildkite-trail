package com.swen90014.paplatypusbackend.controller;

import com.swen90014.paplatypusbackend.controller.utils.ResultUtil;
import com.swen90014.paplatypusbackend.service.impl.CanvasService;
import com.swen90014.paplatypusbackend.service.impl.CourseServiceImpl;
import com.swen90014.paplatypusbackend.service.impl.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/save")
public class SaveCanvasDataController {
    private final CanvasService canvasService;
    private final ScoreServiceImpl scoreService;
    private final CourseServiceImpl courseService;
    private String cronExpression = "0 0 0 * * ?";
    @Autowired
    public SaveCanvasDataController(CanvasService canvasService, ScoreServiceImpl scoreService, CourseServiceImpl courseService) {
        this.canvasService = canvasService;
        this.scoreService = scoreService;
        this.courseService = courseService;
    }
    @GetMapping("/all")
    public ResultUtil saveAllData() {
        CompletableFuture<Boolean> result = canvasService.saveData();
        return new ResultUtil(200, null, "SUCCESS");
    }

    @Scheduled(cron = "#{saveCanvasDataController.cronExpression}")
    public void scheduledAutoSaveData() {
        try {
            canvasService.saveData();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("AUTO FAIL");
        }
    }
    @GetMapping("/frequency/get")
    public ResultUtil getFrequency() {
        String result = cronExpression;
        return new ResultUtil(200, result, "SUCCESS");
    }
    @PostMapping("/frequency")
    public ResultUtil changeSaveFrequency(@RequestBody Map<String, String> payload) {
        if (payload.containsKey("cron")) {
            this.cronExpression = payload.get("cron");
            return new ResultUtil(200, null, "Cron expression updated");
        }
        return new ResultUtil(500, null, "Invalid request");
    }
}
