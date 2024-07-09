# Microservice Ecommerce using Spring Boot Dockerfile

This Spring Boot project provides an efficient solution for order management and tracking in an ecommerce setting. It enables customers to access real-time status updates on their purchases, enhances internal logistics and customer service coordination, and promotes a transparent, satisfying shopping experience. This not only strengthens day-to-day business operations but also fosters customer loyalty by providing clear, up-to-date information about their orders.

## Project Status

This project is currently in development and is being worked on for version 1.0.0.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- MySQL
- Spring Data JPA
- Docker

## Installation and Setup

1. Clone this repository to your local machine using the following command:
    ```bash
    git clone https://github.com/Agustin199811/microservice-ecommerce.git

2. Import the project into your preferred IDE (e.g., IntelliJ IDEA or Eclipse) as a Maven project.

3. Run the Spring Boot application. The application will be available at `http://localhost:8080`.
    - Navigate to the root directory of your project (where your docker-compose.yml file is located).
        - `Build the Docker Compose`:
            ```bash
             docker-compose build
        - `Run the Docker container:`
            ```bash
             docker-compose up

## Usage


The Product Order Status REST API Microservice1 exposes the following endpoints:

- `GET /ecommerce/orders`: Get all orders.
- `GET /ecommerce/orders/customer/{customer}`: find order by customer name.
- `POST /ecommerce/orders`: Create a new orders.

The Product Traking REST API Microservice2 exposes the following endpoints:

- `GET /ecommerce/tracking`: Get all tracking.
- `GET /ecommerce/tracking/{trackingId}`: find tracking by id.
- `POST /ecommerce/tracking`: Create a new tracking.

The Product Iventory REST Microservice3 API exposes the following endpoints:

- `GET /ecommerce/inventory`: Get all inventory.
- `GET /ecommerce/inventory/{productId}`: find inventory by product id.
- `POST /ecommerce/inventory`: Create a new inventory.

You can use tools such as Postman or cURL to send HTTP requests to these endpoints.

## Contribution

If you wish to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b my-new-feature`.
3. Make your changes and commit them: `git commit -am 'Add a new feature'`.
4. Push your changes to your forked repository: `git push origin my-new-feature`.
5. Create a new pull request and describe your changes in detail.

## License

This project is licensed under the MIT License. You can find more information in the `LICENSE` file.

## Contact
Authors: Toapanta Agustin; Llano Edison

If you have any questions or suggestions, feel free to contact the development team at (toapantaagustin9c@gmail.com).
