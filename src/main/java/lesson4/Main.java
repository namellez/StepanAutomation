package lesson4;

public class Main {

    public static void main(String[] args) throws Exception {

       ApacheWorker.getListOfRepoUsers();
       ApacheWorker.inviteUser();

       RestAssuredWorker.inviteUser();
       RestAssuredWorker.getListOfRepoUsers();
    }

}
