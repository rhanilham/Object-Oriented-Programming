### PERCOBAAN 1

_1. Class apa sajakah yang merupakan turunan dari class Employee?_

- Class yang merupakan turunan dari class Employee adalah:
  - InternshipEmployee
  - PermanentEmployee

_2. Class apa sajakah yang implements ke interface Payable?_

- Class yang implements interface Payable adalah:
  - PermanentEmployee
  - ElectricityBill

_3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye)?_

- Pada baris ke-10 dan ke-11, e adalah variabel bertipe Employee, dan tipe data Employee adalah superclass dari PermanentEmployee dan InternshipEmployee. Oleh karena itu, e dapat diisi dengan objek dari kedua kelas tersebut karena konsep polymorphism yang memungkinkan variabel bertipe superclass dapat merujuk pada objek turunannya. Dalam hal ini, e dapat merujuk pada objek pEmp (objek dari PermanentEmployee) dan iEmp (objek dari InternshipEmployee).

_4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objekpEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill)?_

- Pada baris ke-12 dan ke-13, p adalah variabel bertipe Payable, dan tipe data Payable adalah interface yang diimplementasikan oleh PermanentEmployee dan ElectricityBill melalui kelas PermanentEmployee dan ElectricityBill. Oleh karena itu, p dapat diisi dengan objek dari kedua kelas tersebut karena konsep polymorphism yang memungkinkan variabel bertipe interface dapat merujuk pada objek yang mengimplementasikannya. Dalam hal ini, p dapat merujuk pada objek pEmp (objek dari PermanentEmployee) dan eBill (objek dari ElectricityBill).

_5. Coba tambahkan sintaks:  
p = iEmp;  
e = eBill;  
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?_

- Pada baris 14 (p = iEmp;), objek iEmp adalah instance dari InternshipEmployee, yang bukan merupakan instance dari kelas yang mengimplementasikan Payable. Oleh karena itu, objek iEmp tidak dapat diassign ke variabel p yang bertipe Payable.
- Pada baris 15 (e = eBill;), objek eBill adalah instance dari ElectricityBill, yang bukan merupakan instance dari kelas yang diturunkan dari Employee. Oleh karena itu, objek eBill tidak dapat diassign ke variabel e yang bertipe Employee.

_6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!_

- Polimorfisme adalah salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) yang memungkinkan suatu objek untuk memiliki banyak bentuk atau perilaku.

### PERCOBAAN 2

_1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?_

- Pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 dalam class Tester2 menghasilkan hasil yang sama karena meskipun variabel e dideklarasikan sebagai tipe Employee, sebenarnya ia merujuk pada objek yang merupakan instance dari kelas PermanentEmployee.

_2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?_

- Pemanggilan e.getEmployeeInfo() disebut sebagai pemanggilan method virtual karena variabel e dideklarasikan sebagai tipe Employee, memungkinkan Java menentukan implementasi method secara dinamis berdasarkan tipe objek saat runtime. Pada pemanggilan pEmp.getEmployeeInfo(), di mana variabel langsung dideklarasikan sebagai tipe PermanentEmployee, Java tahu implementasi method yang akan dipanggil tanpa perlu penentuan dinamis pada saat runtime, sehingga tidak disebut pemanggilan method virtual.

_3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?_

- Virtual Method Invocation (VMI) adalah konsep dalam pemrograman berorientasi objek di mana metode yang dideklarasikan sebagai "virtual" dalam kelas dasar dapat diimplementasikan ulang dalam kelas turunan. Saat metode tersebut dipanggil pada objek, sistem secara dinamis menentukan implementasi yang sesuai berdasarkan tipe objek aktual pada saat runtime, memungkinkan polimorfisme. Istilah "virtual" menandakan bahwa metode tersebut dapat diimplementasikan ulang dalam kelas turunan.

### PERCOBAAN 3

_1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee)?_

- Array e pada baris ke-8 dalam Tester3 dapat diisi dengan objek berbeda, seperti pEmp (objek PermanentEmployee) dan iEmp (objek InternshipEmployee), karena InternshipEmployee adalah subclass dari Employee. Dalam konsep polimorfisme, objek dari subclass dapat dianggap sebagai objek dari superclass. Oleh karena itu, array yang dideklarasikan sebagai array dari objek Employee dapat menampung objek dari class apapun yang merupakan turunan dari Employee.

_2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling)?_

- Baris ke-9 pada Tester3 memungkinkan array p diisi dengan objek-objek yang berbeda, seperti pEmp (PermanentEmployee) dan eBill (ElectricityBill), karena keduanya mengimplementasikan antarmuka Payable. Dengan demikian, array tersebut dapat menampung objek-objek yang memiliki perilaku pembayaran (getPaymentAmount()) yang sesuai dengan antarmuka tersebut.

_3. Perhatikan baris ke-10, mengapa terjadi error?_

- Pada baris ke-10, terjadi error karena array e2 dideklarasikan sebagai array dari objek Employee, namun mencoba untuk menyimpan objek dari tipe yang berbeda-beda, yaitu PermanentEmployee, InternshipEmployee, dan ElectricityBill. Pada dasarnya, Employee adalah superclass dari PermanentEmployee dan InternshipEmployee, namun tidak terkait dengan ElectricityBill. Karena ElectricityBill tidak mewarisi dari Employee, maka objek dari class ElectricityBill tidak bisa disimpan dalam array Employee[].

### PERCOBAAN 4

_1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable?_

- Pada baris ke-7 dan ke-11 di Tester4, pemanggilan ow.pay(eBill) dan ow.pay(pEmp) dapat dilakukan karena objek eBill (ElectricityBill) dan pEmp (PermanentEmployee) keduanya mengimplementasikan interface Payable. Keduanya memiliki metode getPaymentAmount(), yang dideklarasikan dalam interface Payable.

_Jika diperhatikan lebih detil eBill merupakan objek dari
ElectricityBill dan pEmp merupakan objek dari
PermanentEmployee?_

- Ya, benar. Dalam kelas Tester4, eBill merupakan objek dari kelas ElectricityBill, dan pEmp merupakan objek dari kelas PermanentEmployee. Pada saat pemanggilan metode pay pada objek Owner (ow.pay(eBill); dan ow.pay(pEmp);), tergantung pada jenis objek yang diterima sebagai parameter, metode pay akan melakukan tindakan yang sesuai. Jika objek yang diterima adalah instans dari ElectricityBill, maka akan mencetak informasi tagihan listrik (eb.getBillInfo()), sedangkan jika objek yang diterima adalah instans dari PermanentEmployee, maka akan mencetak informasi karyawan tetap (pe.getEmployeeInfo()).

_2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?_

- Tujuan dari membuat parameter bertipe Payable pada method pay() dalam class Owner adalah untuk memberikan fleksibilitas dalam pengelolaan pembayaran untuk berbagai jenis entitas yang mengimplementasikan interface Payable. Dengan menggunakan tipe data Payable sebagai argumen, method pay() dapat menerima objek dari class-class yang mengimplementasikan interface tersebut, seperti ElectricityBill dan PermanentEmployee.

_3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);
![a](img/a.png)
Mengapa terjadi error?_

- Terjadi error karena InternshipEmployee tidak mengimplementasikan interface Payable. Method pay di class Owner hanya dapat menerima objek yang mengimplementasikan interface Payable, dan InternshipEmployee tidak memenuhi persyaratan tersebut.

_4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?_

- Pada class Owner, sintaks p instanceof ElectricityBill pada baris ke-6 digunakan untuk melakukan pemeriksaan tipe objek p. Ini berguna untuk menentukan apakah objek yang diterima oleh metode pay adalah sebuah instans dari kelas ElectricityBill. Jika kondisi ini terpenuhi, maka blok yang sesuai akan dieksekusi, yaitu mencetak informasi tagihan listrik menggunakan metode getBillInfo() dari objek ElectricityBill.

_5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill?_

- Casting objek pada baris ke-7 dalam class Owner (ElectricityBill eb = (ElectricityBill) p;) diperlukan karena tipe data referensi variabel p adalah Payable, sementara kita ingin mengakses metode dan properti yang spesifik untuk kelas ElectricityBill. Meskipun p memiliki tipe data Payable, kita ingin memperlakukannya seperti objek ElectricityBill untuk dapat mengakses metode getBillInfo() yang tidak ada di antarmuka Payable.
