public class MyPhoneDriver{
    public static void main(String args[]){
        MyPhone phone = new MyPhone("pink", 16.4);
        System.out.println(phone);
        System.out.println(phone.totalPlayTime());
        phone.deleteAllSongs();
        System.out.println(phone);
    }
}
