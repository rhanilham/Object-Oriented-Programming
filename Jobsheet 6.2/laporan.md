### PERCOBAAN 1

_1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!_

- Superclass:
  - Karyawan: Ini adalah class yang menjadi superclass untuk class Manager dan Staff. Superclass ini memiliki atribut dan metode umum yang dapat diwarisi oleh subclass-nya.
- Subclass:
  - Manager: Class ini merupakan subclass dari Karyawan. Manager mewarisi atribut dan metode dari class Karyawan dan menambahkan atribut tunjangan serta metode tampilDataManager.
  - Staff: Class ini juga merupakan subclass dari Karyawan. Staff mewarisi atribut dan metode dari class Karyawan dan menambahkan atribut lembur, potongan, serta metode tampilDataStaff.

_2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?_

- Dalam Java, kata kunci yang digunakan untuk menurunkan suatu class ke class lain disebut extends.

_3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!_

- Dalam class Manager, terdapat atribut:
  - tunjangan
- Atribut yang diwarisi dari class Karyawan:
  - nama
  - alamat
  - jk
  - umur
  - gaji

_4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class
Manager!_
![a](img/a.png)

- Kata kunci super dalam potongan program tersebut digunakan untuk merujuk ke superclass, yaitu class Karyawan. Dalam hal ini, super.gaji merujuk pada atribut gaji yang dimiliki oleh superclass (Karyawan).

_5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!_

- Program pada percobaan 1 di atas termasuk dalam Single Inheritance. Alasannya:
  - Hanya terdapat satu tingkatan class anak (subclass) dari satu class induk (superclass). Dalam hal ini, class Manager dan Staff merupakan subclass dari class Karyawan.
  - Tidak ada class yang mewarisi sifat dari lebih dari satu class induk.

### PERCOBAAN 2

_1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?_

- Single Inheritance:
  - Class Manager, yang merupakan turunan dari class Karyawan.
- Multilevel Inheritance:
  - Class StaffHarian dan StaffTetap, yang keduanya merupakan turunan dari class Staff. Sehingga, ada tingkatan pewarisan seperti Karyawan -> Staff -> StaffHarian dan Karyawan -> Staff -> StaffTetap.

_2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!_

- Atribut Kelas StaffTetap:
  - golongan (String)
  - asuransi (int)
- Atribut Kelas StaffHarian:
  - jmlJamKerja (int)
- Atribut yang diwarisi dari Kelas Staff:
  - nama (String)
  - alamat (String)
  - jk (String)
  - umur (int)
  - gaji (int)
  - lembur (int)
  - potongan (int)

_3. Apakah fungsi potongan program berikut pada class StaffHarian_
![b](img/b.png)

- Pernyataan super (nama, alamat, jk, umur, gaji, lembur, potongan); digunakan dalam konstruktor class StaffHarian untuk memanggil konstruktor classs induk (Staff) dan menginisialisasi atribut-atribut warisan dari kelas tersebut dengan nilai yang diberikan.

_4. Apakah fungsi potongan program berikut pada class StaffHarian_
![c](img/c.png)

- Pernyataan super.tampilDataStaff(); digunakan untuk memanggil method tampilDataStaff() dari class induknya (Staff), sehingga atribut-atribut karyawan dan staff ditampilkan sebelum menambahkan informasi tambahan yang dimiliki oleh class StaffHarian.

_5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap_
![d](img/d.png)
_Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?_

- Dalam class StaffTetap, atribut gaji, lembur, dan potongan dapat diakses langsung karena class StaffTetap merupakan turunan dari class Staff, yang pada gilirannya merupakan turunan dari class Karyawan. Class Karyawan memiliki atribut-atribut (gaji, lembur, dan potongan), dan kelas-kelas turunannya secara otomatis mewarisi atribut tersebut. Oleh karena itu, meskipun tidak ada deklarasi langsung untuk atribut tersebut di class StaffTetap, class ini dapat mengakses atribut tersebut karena mewarisi dari class-class yang lebih tinggi dalam hierarki pewarisan (inheritance).
