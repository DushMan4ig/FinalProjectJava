import java.util.List;

public class ContactView implements ContactContract.View {
    public ContactView(ContactContract.Presenter presenter) {
    }

    public void show() {
        // Отображение интерфейса и обработка пользовательского ввода
    }

    @Override
    public void displayContacts(List<Contact> contacts) {
        // Отображение списка контактов на экране
    }

    @Override
    public void displayErrorMessage(String message) {
        // Отображение сообщения об ошибке
    }
}