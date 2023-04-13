public class App {
    public static void main(String[] args) throws Exception {

        XeDap xd= new XeDap("suc dap",new HangSanXuat("martin", "vietnam"));
        xd.layVanToc();
        System.out.println(xd.toString());
        
    }
}
