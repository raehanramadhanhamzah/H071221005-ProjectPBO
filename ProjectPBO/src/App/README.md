# config
## MyConfig.java
Di dalam Myconfig.java terdapa 3 private variabel (DB_URL,DB_USER,DB_PASS),isi nilai variabel DB_URL sesuai dengan alamat database yang anda punya,untuk DB_USER dan DB_PASS isi saja root dan String kosong itu adalah user dan pass secara default,lalu konekan dengan menggunakan 
DriverManager.getConnection() yang isi parameter nya itu adalah DB URL,USER,dan PASS,lalu buat sysout  apabila koneksi sukses dan apabila koneksi gagal

# layouts
## Menu.java
didalam Menu.java kita buat tampilan tampilan sysout seperti daftar menu nya lalu panggil method sesuai dengan nomor daftar menu,contoh jika menginput  angka satu akan memanggil method readData() yang terdapat di class Read Data,begitu seterusnya
## ReadData.java
ReadData.java berfungsi untuk menampilan semua data yang ada didatabase kedalam terminal,dengan cara menginput ID,nama,harga,jumlah lalu program secara otomatis akan berubah secara langsung
## InsertData.java
ini berfungsi untuk membuat data baru tanpa harus melalui localhost phpmyadmin secara langsung
## EditData.java
ini berfungsi untuk mengedit jumlah data yang ada di ID ke 3 pada database, dengan cara menginput jumlah yang baru,secara otomatis jumlah data di ID ke 3 akan berubah.
## Delete.java
ini berfungsi untuk menghapus satu kolom yang sama(id,nama,harga,jumlah),dengan cara menginput ID berapa yang ingin kita hapus ,secara otomatis satu kolom tersebut akan terhapus.

# App.java
di App.java ini hanya untuk mengeksekusi atau Running program yang sudah dibuat,dengan cara memanggil class Menu.main()  