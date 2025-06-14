# osu-tournament-web

此專案為前後端分離

### 後端
- Spring Boot
- 使用maven包管理
- 資料庫用 Mariadb

### 前端
- Nuxt3 / vue3 (SPA模式)
- 使用npm包管理

### 架構設計圖
- [資料庫](https://dbdiagram.io/d/osu-tournament-web-684a3b59a463a450da2b253e)
- [系統流程圖(WIP)](https://app.diagrams.net/?title=osu-tournament-web.drawio&lightbox=1&page-id=zlzK6_-q4IAIK3xhpbaW&client=1)

## 主要目錄結構
```
src/main
├── frontend 前端
├── java.com.example.osutournament 後端
│  ├── controller
│  ├── model
│  ├── repository
│  └── service
└── resources
    ├── application.properties
    ├── static 前端建置後的檔案
    └── templates
```

## 部屬
1. 前端建置到resources/static
2. 後端建置
3. 部屬到雲端