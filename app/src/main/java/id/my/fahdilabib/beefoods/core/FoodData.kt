package id.my.fahdilabib.beefoods.core

import id.my.fahdilabib.beefoods.R

object FoodData {
    private val names = arrayOf(
        "Asinan Betawi",
        "Kerak Telor Jakarta",
        "Nasi Campur Bali",
        "Nasi Goreng",
        "Nasi Padang",
        "Pempek",
        "Rujak Buah",
        "Soto Kudus",
        "Tempoyak Ikan Patin",
        "Tude Bakar"
    )

    private val descs = arrayOf(
        """
            Bahan:	
            5 porsi
            250 gram Kol (iris tipis-tipis)
            200 gram Tauge
            2 bonggol Slada (iris kasar)
            5 biji Tahu Kuning (potong dadu)
            1 wortel (potong korek api & Siram air panas)
            1 Timun (potong dadu)
            
            Bumbu Halus:
            6 Siung Bawang Putih
            4 sdm Ebi (cuci, rendam air panas)
            6 Buah Cabe merah keriting
            8 Buah Cabe rawit merah
            6 Sdm Kacang tanah (goreng)
            150 ml Air asam jawa / cuka
            200 gram Gula Jawa sisir
            4 sdm Gula Pasir
            3 sdt Garam (tambah jika kurang asin)
            1 ltr Air
        """.trimIndent(),
        """
            Bahan:
            100 gram beras ketan putih yang sudah dicuci dan direndam minimal 3 jam, lebih lama lebih baik.
            250ml air
            5 butir telur bebek
            100 gram kelapa serut
            Sangrai (untuk taburan)
            15 gram ebi udang diseduh, sangrai dan haluskan
            30 gram bawang merah digoreng kering
            1 sendok makan minyak goreng untuk menumis
            Bawang merah goreng (untuk taburan)
            
            Bumbu Halus:
            4 buah cabai merah keriting
            1 cm jahe
            3 cm kencur
            ½ sdt merica butir
            3 siung bawang merah
            1 siung bawang putih
        """.trimIndent(),
        """
            Bahan:  
            - 350 gram daging ayam rebus, suwir-suwir 
            - 1 bungkus santan instan 
            - 3 lembar daun jeruk 
            - 3 lembar daun salam 
            - 1 ruas lengkuas 
            - 2 batang serai, memarkan 
            - 2 sdm minyak untuk menumis 
            - Air, secukupnya
            
            Bumbu Halus: 
            - 6 siung bawang merah 
            - 5 siung bawang putih 
            - 3 buah cabai merah besar 
            - 10 buah cabai rawit merah 
            - ½ sdt terasi 
            - ½ sdt merica bubuk atau secukupnya 
            - 2 sdt garam atau secukupnya 
            - 1 ruas kunyit bakar 
            - 1 sdm gula merah, sisir 
            - 3 sdm air asam jawa
        """.trimIndent(),
        """
            Bahan:	
            1 piring nasi dingin
            5 bh cabe rawit, iris
            3 bh bawang merah, iris
            2 siung bawang putih, iris
            1 btr telur
            1 sdm kecap manis
            1 sdm kecap asin
            1/2 sdt gula pasir
            1/2 sdt merica
            secukupnya Garam
        """.trimIndent(),
        """
            Bahan:	
            500 gr daging ayam
            500 ml santan kental
            200 ml air
            2 batang serai geprek
            4 lbr daun jeruk
            2 lbr daun salam
            1 lbr daun kunyit
            1 buah bunga lawang
            secukupnya Garam, gula
            2 sdm kelapa parut sangrai, haluskan
            
            Bumbu Halus:
            8 buah bawang merah
            5 buah bawang putih
            8 buah cabe merah
            1/4 biji pala
            1/2 sdm ketumbar
            1 ruas jahe
            3 cm lengkuas
            1 ruas kunyit
            
            Sambal ijo:
            20 buah cabe ijo keriting
            10 buah cabe rawit ijo
            2 buah tomat hijau
            4 buah bawang merah
            Secukupnya garam, gula
        """.trimIndent(),
        """
            Bahan:	
            250 gram ikan tengiri
            180 gram tepung tapioka
            3 sdm tepung terigu
            180 ml air dingin / air es (agar pempek kenyal)
            5 butir bawang putih (haluskan)
            1 butir telur (putih telur)
            1 sdt gula
            secukupnya garam (sesuai selera)
            
            Isi utk pempek selam :
            4 butir kuning telur (byk nya sesuai pempek yg mau dibentuk kapal selam
            
            Kuah cuko :
            3 batok gula merah
            700 ml air
            1 sdm asem jawa
            1 sdm gula pasir
            3 siung bawang putih (haluskan)
            8 buah cabai rawit/ jika tdk suka pedas bisa dikurangi (haluskan)
            2 sdt ebi (haluskan)
            1 sdt gula pasir
        """.trimIndent(),
        """
            Bahan:	
            1 buah bengkuang,potong tipis besar
            1/4 buah pepaya mengkal,potong tipis besar
            300 grm nanas,potong memanjang
            8 buah jambu air potong jadi 4
            2 buah ketimun,potong tipis besar
            
            Bahan Bumbu Rujak:
            2 buah cabe merah
            100 grm gula merah
            1/2 sdt garam
            150 grm kacang kulit di goreng
            2 sdt air asam
            1 sdt terasi
        """.trimIndent(),
        """
            Bahan:
            1 kg daging kerbau
            2 batang serai, geprek keduanya menggunakan cobek
            2 lembar daun salam
            4 tauge, cuci bersih
            3 cm lengkuas, (di geprek)
            ½ sendok teh kaldu bubuk instan rasa ayam atau sapi
            3 buah jeruk nipis, peras dan ambil sarinya
            Gula secukupnya
            Garam secukupnya
            3 sendok kecap manis
            Minyak untuk menggoreng dan menumis
            air bersih secukup nya
            
            Bumbu Halus:
            ½ sendok teh jinten
            1 sendok makan merica bubuk
            3 cm jahe
            4 siung bawang putih
            6 siung bawang merah
            6 buah kemiri
            
            Bahan Pelengkap:
            Bawang goreng secukupnya
            Daun seledri secukupnya iris tipis
            Daun bawang secukupnya, iris tipis
            4 butir telur rebus, kupas dan belah menjadi 2 bagian
        """.trimIndent(),
        """
            Bahan:
            2 buah durian, ambil dagingnya
            3 buah cabai merah
            Garam secukupnya
            
            Cara membuat:
            Haluskan daging durian hingga lembut. Tambahkan garam, aduk hingga merata. 
            Koreksi rasanya.
            Siapkan stoples atau wadah kedap udara, potong cabai berukuran kecil-kecil.
            Masukkan durian dan potongan cabai ke dalam stoples, tutup rapat.
            Simpan selama tiga hari, buka stoples selama lima menit. Tutup kembali dan simpan lagi selama empat hari.
            Setelah itu, tempoyak bisa kamu santap.
        """.trimIndent(),
        """
            Bahan:
            1.000 g ikan kembung
            2 sdm air jeruk nipis/lemon cui
            1½ sdt garam 
            100 ml air
            3 sdm minyak goreng/margarin 

            Dabu-dabu:
            25 g cabai rawit
            3 buah cabai merah
            6 butir bawang merah
            200 g tomat merah dan hijau
            50 ml air jeruk nipis/lemon cui
            ½ sdt garam
            ½ sdt gula pasir
        """.trimIndent()
    )

    private val prices = arrayOf(
        14_000,
        7_000,
        13_000,
        23_000,
        26_000,
        9_000,
        17_000,
        18_000,
        26_000,
        21_000
    )

    private val rates = arrayOf(
        3.5F,
        4F,
        3F,
        4.5F,
        4.5F,
        5F,
        3.5F,
        4F,
        4.5F,
        5F
    )

    private val imgs = arrayOf(
        R.drawable.img_asinan_betawi,
        R.drawable.img_kerak_telor_jakarta,
        R.drawable.img_nasi_campur_bali,
        R.drawable.img_nasi_goreng,
        R.drawable.img_nasi_padang,
        R.drawable.img_pempek,
        R.drawable.img_rujak_buah,
        R.drawable.img_soto_kudus,
        R.drawable.img_tempoyak_ikan_patin,
        R.drawable.img_tude_bakar
    )

    fun all() : ArrayList<Food> {
        val list = arrayListOf<Food>()

        for (position in names.indices) {
            list.add(
                Food(
                    names[position],
                    descs[position],
                    prices[position],
                    rates[position],
                    imgs[position]
                )
            )
        }

        return list
    }
}