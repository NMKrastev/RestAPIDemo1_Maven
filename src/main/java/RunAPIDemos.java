public class RunAPIDemos {
    public static void main(String[] args) {

        APIList list = new APIList();
        APISingleUser singleUser = new APISingleUser();

        list.getAPIResponseListOne();
        list.getAPIResponseListTwo();
        singleUser.getAPIResponseSingleUserOne();
        singleUser.getAPIResponseSingleUserTwo();
    }
}