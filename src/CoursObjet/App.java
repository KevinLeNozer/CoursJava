package CoursObjet;

public class App {
    public static void main(String[] args) {
        //Mammifere m = new Mammifere(); --> KO

        Chat chat = new Chat();
        chat.seNourrir();
        chat.gestation();
        chat.chasser();

        Mammifere autreChat = new Chat();
        autreChat.seNourrir();
        ((Chat)autreChat).miaou();

        Ornithorinque ornithorinque = new Ornithorinque();
        ornithorinque.seNourrir();
        ornithorinque.gestation();
    }
}
