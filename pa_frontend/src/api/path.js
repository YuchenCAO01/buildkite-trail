//const port = process.env.PORT || 8081

const base = {
  baseUrlCICD : 'http://182.92.169.27/pa-api',
  // baseUrlCICD : 'http://localhost:8082',
  //baseUrlRelease    
  //baseUrlDeployed

  course: '/course',
  getAllCourse: '/getAll',
  getCourseById: '/getCourseById',
  getCourseByCourseName: '/getCourseByCourseName',
  getCourseByCourseCode: '/getCourseByCourseCode',

  user: '/user',
  getAllUser: "/getAll",
  getUserById: "/getUserById",


  student: '/student',
  getStudentByCourseId: '/getStudentByCourseId',
  getAllStudentScores: '/getStudentSummaryByCourseId',

  score: '/score',
  getScoreByCidAndSid: '/getScoreForGivenUserId',

  email: '/email',
  sendIndividual: '/sendIndividual',
  sendToAll: '/sendAll',

  teacher: '/teacher',
  getTeacherByCourseId: '/getTeacherByCourseId',
  setTeacherAccess: '/setTeacherAccess',

  overview: '/overview',

  chart: '/chart',
  getAssignmentBarChartsData: '/getBarData',
  getIndividualPieData: '/getPieData',
  
  assignment: "/assignment",
  getAssignmentByCourseId: "/getAssignmentByCourseId",
  changeWeight: "/changeWeight",


  save: "/save",
  getFreq: '/frequency/get',
  setFreq: '/frequency',




  subejct        : '/subject',
  access         : '/access',
  staff          : '/staff',
  
  
}

export default base;
