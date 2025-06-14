<script setup lang="ts">
const route = useRoute()
const { data, status } = useAPI(() => `/api/hello`, {
  query: { name: route.query.name },
})
</script>

<template>
  <h1 v-if="status == 'pending'">Loading...</h1>
  <h1 v-if="status == 'error'">Error...</h1>
  <h1 v-else>{{ data }}!</h1>
</template>

<style scoped>

</style>