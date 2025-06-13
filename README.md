 CoinSight – Crypto Tracker App

> **CoinSight** is a modern Android app built with **Jetpack Compose** and **Clean Architecture**. It fetches real-time cryptocurrency data from the [CoinPaprika API](https://api.coinpaprika.com/) and displays coin details such as name, description, tags, and team members.

 **The main purpose of this project is to learn and implement Clean Architecture in a real-world Android app.**



 Architecture

This project follows **Clean Architecture** principles with proper separation of concerns across:

- **Presentation Layer** → Jetpack Compose UI + ViewModel + State handling  
- **Domain Layer** → UseCases + Business Logic  
- **Data Layer** → Retrofit API calls + DTO mapping + Repository Implementation  

---

 Features

-  List of all cryptocurrencies (fetched from CoinPaprika)
-  Search bar to filter cryptocurrencies in real-time
-  Detailed view of each coin including:
  - Rank, Symbol, Name
  - Description
  - Tags (displayed in FlowRow layout)
  - Team members with name and position
-  Proper UI state handling (loading, success, error)
-  Modular & scalable codebase for real-world apps



![Screenshot (35)](https://github.com/user-attachments/assets/7c83efeb-7dd3-45ac-889f-7bf619f34191)
![Screenshot (36)](https://github.com/user-attachments/assets/b976c73e-c690-4e94-b601-7b4429c5848a)

