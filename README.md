# GD8_A_11378

Pendahuluan
Biasanya dalam perancangan atau pemrograman, kita tidak dapat menghindari
kesalahan atau kita dapat menyebutnya sebagai Error. Error umumnya diklasifikasikanmenjadi tiga bagian, yaitu:

1. Syntax Error
Error ini dapat terjadi ketika programmer menggunakan syntax yang salahsaat
menulis code, sehingga menyebabkan error pada waktu kompilasi. Contoh: 
  - Lupa menambahkan titik koma (;) ke code program
  - Kesalahan pada beberapa huruf tertentu (string dengan ‘s’ kecil)

2. Semantic Error
Error ini terjadi ketika output dari program tidak seperti dengan apa yangdiharapkan. Contoh: - Kalian ingin mengeluarkan “Anda Lulus” jika nilai lebih bes ar dari 80 
(nilai > 80), tetapi code program mengeluarkan “Anda Gagal”. - Kalian ingin menampilkan kata “Aku Bisa!” sebanyak 5 kali, tetapi hasil
yang tertampil hanya 4 kali. 3. Runtime Error
Error ini pada awalnya akan berfungsi normal, hingga mencapai kode programyang menyebabkan error. Error ini dapat menyebabkan programberhenti secaratidak normal yang 
bisasa disebut crash. Contoh: 
  - Pembagian dengan 0. 
  - Menggunakan indeks array yang lebih besar dari ukuran array. 
  - Ketika program meminta anda untuk menginput angka, 
tetapi andamenginputkan huruf.


Exception adalah kondisi yang disebabkan oleh runtime error, sehingga kondisi
exception ini harus ditangani (handling), agar program dapat berlanjut hingga keluar secaranormal. Oleh karena itu, Exception Handling adalah mekanisme yang 
diperlukan untuk menangani error. Terdapat kata kata kunci yang dapat digunakan di Exception Handling, yaitu:
1. Try
Untuk meletakkan code yang berpotensi menyebabkan error. 
2. Catch
Intruksi yang menangani exception. 
3. Finally
Bagian ini akan tetap dijalankan baik ketika ada exception atau tidak, bagianini
bersifat opsional. 
4. Throw
Keyword ini digunakan untuk melemparkan kelas exception yang telah kita buat. 
5. Throws
Keyword ini digunakan untuk method atau konstruktor yang di dalamnyaadakondisi yang akan menyebabkan error. Berikut adalah bentuk umum dari try, catch, finally


try{
// berisikan code-code yang berpotensi adanya eksepsi
}
catch(Exception e1){
// berisikan kode yang digunakan untuk menangani exceptionke-1}
catch(Exception eN){
// berisikan kode yang digunakan untuk menangani exceptionke-N}
finally {
// blok ini akan jalan ketika catch-catch sudah terlewati}
