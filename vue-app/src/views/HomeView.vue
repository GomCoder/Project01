<template>
  <div class="home">
    <router-link to="/user">사용자 목록</router-link>
    <br />
    <button @click="getData">데이터 호출</button>
  </div>
</template>

<script>
import axios from "axios";

//사용자 수정 기능 테스트를 위한 가상 데이터
const uForm =  {
  no: 1,
  name: '테스트',
  email: 'test@email.com',
  pwd: '1234',
  gender: true
}

//사용자 정보 삭제 테스트를 위한 가상 파라미터
const params = {
  params: {no: 1}
}

export default {
  name: 'HomeView',
  methods: {
    getData() {
      axios
        //.get('http://localhost:8080/')
        .post('http://localhost:8080/findAll')
        .then((response) => {
        console.log(response)
      })
      .catch((error) => {
        console.log(error)
      })
    }
  }
}
</script>

<style scoped>
a {
  color: black;
  text-decoration: none;
  font-weight: bold;
  font-size: 1.5rem;
}

</style>