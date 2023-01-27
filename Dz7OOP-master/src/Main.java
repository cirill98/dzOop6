import Note.controllers.UserController;
import Note.model.FileOperation;
import Note.model.FileOperationImpl;
import Note.model.Repository;
import Note.model.RepositoryFile;
import Note.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("id.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
