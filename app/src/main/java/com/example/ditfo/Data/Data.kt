package com.example.ditfo.Data

import com.example.ditfo.MyModel
import com.example.ditfo.R

object Data {

    fun getOlahraga(): List<SecondData>{
        val list = ArrayList<SecondData>()
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Jalan Kaki",
                image = R.drawable.jalan_kaki_list,
                subtitle = "Aktifitas jalan kaki untuk diet",
                describe = "Jalan kaki sangat mudah dilakukan dan tidak membutuhkan perlengkapan atau pakaian khusus. Selain itu, dapat dilakukan dimana saja dan kapan saja. Olahraga ini dapat dilakukan rutin setiap hari berjalan kaki selama 30 menit. Dengan durasi tersebut mampu membakar setidaknya 167 kalori tubuh. "
            )
        )
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Jogging",
                image = R.drawable.jogging_list,
                subtitle = "Jogging cukup umum dilakukan orang-orang",
                describe = "Jogging bisa menjadi olahraga untuk diet menurunkan berat badan yang bisa Anda lakukan secara rutin. Jogging mampu membakar kalori sekitar 300-370 kalori selama 30 menit, tergantung dari intensitas dan kecepatan yang dilakukan. Untuk mengawalinya, cobalah untuk jogging atau berlari santai selama 20-30 menit per hari. Jika Anda melakukannya secara rutin, lama waktu Anda melakukannya juga pasti akan meningkat karena sudah terbiasa."
            )
        )
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Lompat Tali",
                image = R.drawable.lompat_tali_list,
                subtitle = "Olahraga ini cocok jika malas keluar rumah",
                describe = "Lompat tali baik untuk mengencangkan otot dan dapat membakar hingga 10 kalori per menit. +\n" +
                        "Lompat tali dengan intensitas rendah mampu membakar sekitar 281 kalori selama 30 menit. Namun jika Anda melakukan lompat tali dengan intensitas tinggi, latihan ini mampu membakar hingga 421 kalori dalam durasi yang sama"
            )
        )
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Plank",
                image = R.drawable.plank,
                subtitle = "Olahraga yang cukup sederhana tapi dapat membantu diet anda",
                describe = "Plank merupakan olahraga di rumah yang cepat menurunkan berat badan. Plank termasuk dalam olahraga paling sederhana yang dapat Anda lakukan dalam upaya menurunkan berat badan selama berada di rumah.\n" +
                        "\n" +
                        "Gerakan plank sangat baik untuk melatih otot dan membakar lemak di badan, sehingga latihan ini sangat bagus untuk menurunkan berat badan dan menguatkan tulang punggung.\n" +
                        "Cara melakukan plank:\n" +
                        "1. Siapkan matras\n" +
                        "2. Ambil posisi seperti push-up\n" +
                        "3. Tekuk lengan hingga membentuk sudut 90 derajat hingga siku menyentuh matras\n" +
                        "4. Tahan posisi tersebut selama 2 menit\n" +
                        "5. Ulangi gerakan serupa selama 10 kali atau sesuai kemampuan"
            )
        )
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Squats",
                image = R.drawable.squats_list,
                subtitle = "Olahraga yang cukup sederhana tapi dapat membantu diet anda",
                describe = "Latihan ini bagus untuk membentuk paha dan bokong yang ideal. Gerakan squat dapat membantu melatih otot inti tubuh termasuk otot perut bagian bawah yang menjadi salah satu bagian tubuh yang menyimpan lemak terbanyak.\n" +
                        "\n" +
                        "Cara melakukan squats:\n" +
                        "1. Berdiri tegak\n" +
                        "2. Buka kedua kaki hingga sejajar dengan bahu\n" +
                        "3. Turunkan pinggul hingga posisi seperti duduk\n" +
                        "4. Kembali ke posisi berdiri\n" +
                        "5. Lakukan hingga 20 hitungan"
            )
        )
        list.add(
            SecondData(
                head = "Olahraga",
                title = "Cardio",
                image = R.drawable.cardio_list,
                subtitle = "Olahraga ini juga dapat memperlancar sirkulasi darah",
                describe = "Olahraga ini bisa jadi pilihan olahraga di rumah yang cepat menurunkan berat badan.\n" +
                        "\n" +
                        "Salah satu dari cardio adalah aerobik karena baik untuk melatih otot-otot tubuh. Saat ini Anda dapat leluasa memilih model latihan aerobik yang bisa Anda jumpai di Youtube.\n" +
                        "\n" +
                        "Jenis olahraga cardio lain yang dapat Anda lakukan di rumah di antaranya naik turun tangga dan jogging. Olahraga ini baik untuk mengurangi stres, meningkatkan sirkulasi darah dan memperkuat otot jantung."
            )
        )
        return list
    }

    fun getMakanan(): List<SecondData>{
        val list = ArrayList<SecondData>()

        list.add(
            SecondData(
                head = "Makanan",
                title = "Sayur dan Buah",
                image = R.drawable.buah_sayur_list,
                subtitle = "Manfaat sayur dan buah untuk diet",
                describe = "Sayuran dan buah-buahan banyak mengandung serat, vitamin, dan mineral yang bagus untuk menjalani program diet sehat sehari-hari. Terutama kandungan seratnya membuat proses pencernaan menjadi lebih lancar. "
            )
        )
        list.add(
            SecondData(
                head = "Makanan",
                title = "Daging",
                image = R.drawable.daging_list,
                subtitle = "Peran daging dalam berdiet",
                describe = "Daging bisa jadi makanan sehat untuk anda yang menjalani diet sehat. Namun tak sembarangan daging yang bisa anda makan. Daging dengan kandungan lemak yang rendah adalah makanan yang harus anda konsumsi jika ingin menyukseskan program diet anda. Memasak daging sebaiknya tidak dengan digoreng karena minyaknya yang mengandung lemak jahat"
            )
        )
        list.add(
            SecondData(
                head = "Makanan",
                title = "Ikan",
                image = R.drawable.ikan_list,
                subtitle = "Manfaat ikan untuk diet",
                describe = "Sebagai hewan sumber protein yang mengandung omega 3 serta protein tinggi yang baik bagi kesehatan tubuh. Walaupun mengandung lemak, namun lemak yang terkandung didalam ikan bukanlah lemak yang jahat yang berbahaya bagi tubuh anda. Bagi anda yang menjalani program diet, konsumsilah ikan yang dimasak dengan cara direbus atau dikukus agar benar-benar mendapatkan manfaat sehat dari ikan yang dikonsumsi."
            )
        )
        return list
    }

    fun getMealPlan(): List<SecondData> {
        val list = ArrayList<SecondData>()

        list.add(
            SecondData(
                head = "Meal Plan",
                title = "Makan Pagi",
                image = R.drawable.makan_pagi_list,
                subtitle = "Komposisi nutrisi makan pagi untuk diet",
                describe = "-\tMakanan pokok 1 porsi (nasi 100 g)\n" +
                        "-\tLauk nabati 1 porsi (tempe 50 g= 2 potong)\n" +
                        "-\tSayur 1 porsi (sayuran 100 g= 1 mangkok)\n" +
                        "-\tBuah 1 porsi (pisang 1 buah)\n" +
                        "Snack pagi : buah 1 porsi (semangka 200 g)"
            )
        )
        list.add(
            SecondData(
                head = "Meal Plan",
                title = "Makan Siang",
                image = R.drawable.makan_siang_list,
                subtitle = "Komposisi nutrisi makan siang untuk diet",
                describe = "-\tMakanan pokok 1 porsi (nasi 100 g)\n" +
                        "-\tLauk nabati 1 porsi (tahu 100g= 1 potong)\n" +
                        "-\tLauk hewani 1 porsi (telur 50g= 1 butir)\n" +
                        "-\tSayur 1 porsi (sayuran 100 g=1 mangkok)\n" +
                        "Snack sore : buah 1 porsi (papaya 110 g=1 potong sedang)"
            )
        )
        list.add(
            SecondData(
                head = "Meal Plan",
                title = "Makan Malam",
                image = R.drawable.makan_malam_list,
                subtitle = "Komposisi nutrisi makan malam untuk diet",
                describe = "Makan malam :\n" +
                        "-\tMakanan pokok 1 porsi (nasi 100 g)\n" +
                        "-\tLauk nabati 1 porsi (tempe 50g= 2 potong)\n" +
                        "-\tLauk hewani 1 porsi (ayam 50g= 1 potong)\n" +
                        "-\tSayur 1 porsi (sayuran 100 g=1 mangkok)"
            )
        )
        return list
    }

    fun getResep(): List<SecondData>{
        val list = ArrayList<SecondData>()

        list.add(
            SecondData(
                head = "Resep Menu Diet",
                title = "Sup Ayam Tiga Bumbu",
                image = R.drawable.sup_ayam_list,
                subtitle = "Resep sup ayam tiga bumbu",
                describe = "Bahan :\n" +
                        "-\t½ kg ayam kampung\n" +
                        "-\t6 siung bawang merah\n" +
                        "-\t4 lembar daun salam\n" +
                        "-\tGaram secukupnya\n" +
                        "\n"+
                        "Cara membuat :\n" +
                        "-\tIris bawang merah, rebus air sampai mendidih\n" +
                        "-\tMasukkan ayam dan 3 bumbu lainnya\n" +
                        "-\tMasak hingga daging ayam empuk\n"
            )
        )

        list.add(
            SecondData(
                head = "Resep Menu Diet",
                title = "Ayam Geprek Oatmeal",
                image = R.drawable.ayamgeprek_oatmeal_list,
                subtitle = "Resep ayam geprek oatmeal",
                describe = "Bahan :\n" +
                        "-\t100 gr dada ayam fillet\n" +
                        "-\t2 sdt tepung maizena \n" +
                        "-\tBawang putih, garam dan lada untuk marinasi\n" +
                        "-\tExtra light olive oil untuk menumis\n\n" +
                        "Cara membuat :\n" +
                        "-\tMarinasi ayam minimal 10 menit\n" +
                        "-\tLumuri dengan tepung maizena dan masukkan dalam oatmeal\n" +
                        "-\tDiamkan di freezer agar oatmeal menempel\n" +
                        "-\tGoreng dengan api kecil sampai matang\n" +
                        "\n" +
                        "Bahan sambal : cabe rawit, cabe merah, bawang putih\n" +
                        "Cara membuat : haluskan bawang putih, cabe merah dan cabe rawit lalu tumis dan beri sedikit garam.\n" +
                        "\n" +
                        "Note : ayam dapat diganti dengan ayam dipanggang tanpa tepung."
            )
        )

        list.add(
            SecondData(
                head = "Resep Menu Diet",
                title = "Roti Alpukat",
                image = R.drawable.roti_alpukat_list,
                subtitle = "Resep roti alpukat",
                describe = "Bahan: \n" +
                        "-\t1 slice roti gandum\n" +
                        "-\tAlpukat\n" +
                        "-\t1 butir telur orak arik tanpa minyak dan garam\n" +
                        "-\t½ buah tomat\n" +
                        "\n"
            )
        )

        list.add(
            SecondData(
                head = "Resep Menu Diet",
                title = "Cah Sawi Jamur",
                image = R.drawable.cah_sawijamur_list,
                subtitle = "Resep cah sawi jamur",
                describe = "Bahan :\n" +
                        "-\tSawi ukuan sedang\n" +
                        "-\tJamur \n" +
                        "-\t1 siung bawang putih\n" +
                        "-\tGaram, kaldu jamur, extra light olive oil secukupnya\n\n" +
                        "Cara memasak :\n" +
                        "-\tTumis jamur dan bawang putih sampai harum\n" +
                        "-\tMasukkan sawi, tambahkan garam dan kaldu jamur\n" +
                        "-\tTambah sedikit air\n" +
                        "-\tMasak hingga matang"
            )
        )

        return list
    }

    fun getHome(): List<MyModel>{
        val list = ArrayList<MyModel>()

        list.add(
            MyModel(
                "Olahraga",
                R.drawable.olahraga_home,
                "#C7E78B",
                0,
                "Ini adalah dikripsi untuk halaman yang pertama woy"
            )
        )
        list.add(
            MyModel(
                "Makanan",
                R.drawable.makanan_home,
                "#C7E78B",
                1,
                "Ini adalah dikripsi untuk halaman yang kedua woy"
            ))
        list.add(
            MyModel(
                "Meal Plan",
                R.drawable.meal_plan_home,
                "#C7E78B",
                2,
                "Ini adalah dikripsi untuk halaman yang ketiga woy"
            )
        )
        list.add(
            MyModel(
                "Resep Menu Diet",
                R.drawable.resep_home,
                "#C7E78B",
                3,
                "Ini adalah dikripsi untuk halaman yang ketiga woy"
            ))

        return list
    }
}