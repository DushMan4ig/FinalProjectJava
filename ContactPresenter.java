import java.util.ArrayList;
import java.util.List;

public class ContactPresenter implements ContactContract.Presenter {
    private ContactContract.View view;
    private List<Contact> contacts = new ArrayList<>();

    public ContactPresenter(ContactContract.View view) {
        this.view = view;
    }

    @Override
    public void loadContacts() {
        // Здесь можно загрузить контакты из базы данных или другого источника
        view.displayContacts(contacts);
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
        view.displayContacts(contacts);
    }
}
