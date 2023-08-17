public class Main {
    public static void main(String[] args) {
        ContactContract.View view = new ContactView(new ContactPresenter(view));
        view.show();
    }
}