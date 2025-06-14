export default defineNuxtPlugin((nuxtApp) => {
    const api = $fetch.create({
        baseURL: import.meta.env.DEV ? 'http://localhost:8080' : undefined,
    })

    return {
        provide: {
            api
        }
    }
})
