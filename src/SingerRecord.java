public class SingerRecord {
    public static class Singers {

        private int id;
        private String name;
        private String address;
        private String dateofbirth;
        private int albumspubno;

        public Singers() {
            this.id = 00;
            this.name = "";
            this.address = "";
            this.dateofbirth = "";
            this.albumspubno = 00;
        }

        // Constructor (ID)
        public Singers(int id) {
            this();
            this.id = id;
        }

        // Constructor ( NAME,ID)
        public Singers(int id, String name) {
            this(id);
            this.name = name;
        }

        // Constructor (ID,NAME,ADDRESS)
        public Singers(int id, String name, String address) {
            this(id, name);
            this.address = address;
        }

        // Constructor(ID,NAME,ADDRESS,DOB)
        public Singers(int id, String name, String address, String dateofbirth) {
            this(id, name, address);
            this.dateofbirth = dateofbirth;
        }

        // Constructor (ID,ADDRESS,DOB,NOOFALBUMPUBLISHED)
        public Singers(int id, String name, String address, String dateofBirth, int albumsPublished) {
            this(id, name, address, dateofBirth);
            this.albumspubno = albumsPublished;
        }

        // Setter(ID)
        public void setId(int id) {
            this.id = id;
        }
        // Setter(NAME)
        public void setName(String name) {
            this.name = name;
        }
        // Setter(ADDRESS)
        public void setAddress(String address) {
            this.address = address;
        }
        // Setter(DOB)
        public void setdateofBirth(String dateofbirth) {
            this.dateofbirth = dateofbirth;
        }
        // Getter(album)
        public void setalbumsPublished(int albumsPublished) {
            this.albumspubno = albumsPublished;
        }


        public void setdetails(int id, String name, String address, String dateofbirth, int albumsPublished) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.dateofbirth = dateofbirth;
            this.albumspubno = albumsPublished;
        }

        // Getter(ID)
        public int getId() {
            return id;
        }
        // Getter(NAME)
        public String getName() {
            return name;
        }
        // Getter(ADDRESS)
        public String getAddress() {
            return address;
        }
        // Getter(DOB)
        public String getdateofbirth() {
            return dateofbirth;
        }
        // Getter(ALBUM)
        public int getalbumsPublished() {
            return albumspubno;
        }
    }

    public static void main(String[] args) {
        Singers singer1 = new Singers();
        System.out.println("Data of Artist:\n");
        System.out.println("ID of singer: " + singer1 .getId());
        System.out.println("Name of singer: " +singer1 .getName());
        System.out.println("Address of singer: " + singer1 .getAddress());
        System.out.println("Date of Birth of singer: " + singer1 .getdateofbirth());
        System.out.println("Number of Albums Published of singer: " + singer1 .getalbumsPublished());
        //new values
        singer1 .setId(10);
        singer1 .setName("Taylor Swift");
        singer1 .setAddress("556 Military Trail");
        singer1 .setdateofBirth("1999-11-01");
        singer1 .setalbumsPublished(10);
       //display
        System.out.println("Data updated for Artist:\n");
        System.out.println("ID of singer: " + singer1 .getId());
        System.out.println("Name of singer: " + singer1 .getName());
        System.out.println("Address of singer: " + singer1 .getAddress());
        System.out.println("Date of Birth of singer: " + singer1 .getdateofbirth());
        System.out.println("Number of Albums Published of singer: " + singer1 .getalbumsPublished());
    }
}
