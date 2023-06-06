const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

//CORS 문제 해결을 위한 Proxy
// const target = 'http://localhost:8080'
// module.exports = {
//   //개발자 서버
//   devServer: {
//     port:8080,
//     proxy: {
//       '/api' :{
//         target,
//         changeOrigin: true
//       }
//     }
//   }
// }