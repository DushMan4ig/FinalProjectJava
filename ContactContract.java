import java.util.List;

public interface ContactContract {
    interface View {
        void displayContacts(List<Contact> contacts);
        void displayErrorMessage(String message);
        void show();
    }

    interface Presenter {
        void loadContacts();
        void addContact(String name, String phoneNumber);
    }
}