import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CRMInterface extends Application {

    private ClientService clientService; // Сервисный класс для работы с клиентами

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CRM Система");

        // Создание элементов управления
        Label nameLabel = new Label("Имя:");
        TextField nameTextField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();
        Button addButton = new Button("Добавить");
        Button deleteButton = new Button("Удалить");

        // Обработка события нажатия кнопки "Добавить"
        addButton.setOnAction(event -> {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            Client newClient = new Client(name, email);
            clientService.addClient(newClient);
            nameTextField.clear();
            emailTextField.clear();
            showAlert("Успех", "Клиент успешно добавлен в базу данных.");
        });

        // Обработка события нажатия кнопки "Удалить"
        deleteButton.setOnAction(event -> {
            String name = nameTextField.getText();
            Client client = clientService.getClientByName(name);
            if (client != null) {
                clientService.deleteClient(client);
                nameTextField.clear();
                emailTextField.clear();
                showAlert("Успех", "Клиент успешно удален из базы данных.");
            } else {
                showAlert("Ошибка", "Клиент не найден в базе данных.");
            }
        });

        // Создание сетки для размещения элементов управления
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Размещение элементов управления в сетке
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);
        gridPane.add(emailLabel, 0, 1);
        gridPane.add(emailTextField, 1, 1);
        gridPane.add(addButton, 0, 2);
        gridPane.add(deleteButton, 1, 2);

        // Создание сцены и установка сетки на сцену
        Scene scene = new Scene(gridPane, 300, 150);

        // Установка сцены на основную сцену приложения
        primaryStage.setScene(scene);

        // Отображение окна приложения
        primaryStage.show();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        // Инициализация сервисного класса перед запуском приложения
        // Здесь вы должны создать экземпляр класса ClientService и передать соответствующий репозиторий или DAO
        // Например:
        // ClientRepository clientRepository = new ClientRepository(); // Репозиторий для работы с клиентами
        // ClientService clientService = new ClientService(clientRepository); // Сервисный класс для работы с клиентами

        launch(args);
    }
}
