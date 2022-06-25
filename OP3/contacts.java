package contacts;

class contacts {

    public class contacts {

        private int id;
        private String firstName;
        private String LastName;
        private String address;
        private String phone;
        private String note;

        public contacts(int id, String firstName, String LastName, String address, String phone, String note) {
            this.id = id;
            this.firstName = firstName;
            this.LastName = LastName;
            this.address = address;
            this.phone = phone;
            this.note = note;

        }

        public int getid() {
            return id;
        }

        public void setid(int id) {
            this.id = id;
        }

        public String getfirstName() {
            return firstName;
        }

        public void setfirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void LastName(String LastName) {
            this.LastName = LastName;
        }

        public String getaddress() {
            return address;
        }

        public void setaddress(String address) {
            this.address = address;
        }

        public String getphone() {
            return phone;
        }

        public void setphone(String phone) {
            this.phone = phone;
        }

        public String getnote() {
            return note;
        }

        public void setnote(String note) {
            this.note = note;
        }


        public String toString() {
            return "Идентификатор котнакта-" + id + "\n" + "Имя-" + firstName + "\n" + "Фамилия-" + LastName + "\n" + "Адрес-" + address + "\n" + "Телефон-" + phone + "\n" + "Запись о контакте-" + note + "\n";
        }
    }
}
