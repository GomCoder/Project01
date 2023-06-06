import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  //List
  {
    path: '/user',
    name: 'ListView',
    component: () => import(/* webpackChunkName: "user" */ '../views/ListView.vue')
  },
  //Create
  {
    path: '/user/save',
    name: 'CreateView',
    component: () => import(/* webpackChunkName: "user" */ '../views/CreateView.vue')
  },
  //Select
  {
    path: '/user/findById',
    name: 'SelectView',
    component: () => import(/* webpackChunkName: "user" */ '../views/SelectView.vue')
  },
  //Update
  {
    path: '/user/editById',
    name: 'UpdateView',
    component: () => import(/* webpackChunkName: "user" */ '../views/UpdateView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
