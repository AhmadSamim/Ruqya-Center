package com.sheesha.ruqyacenter.data.quranapi

object VersesRepository {

    fun Ayat_Dahm_Fahisha(): List<Pair<Int, Int>> {
        return listOf(
            // Al-Fatiha
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),
            // Al-Baqara
            Pair(2, 30), Pair(2, 168), Pair(2, 169), Pair(2, 205), Pair(2, 219), Pair(2, 222), Pair(2, 268), Pair(2, 275),
            // Aal-Imran
            Pair(3, 14), Pair(3, 119), Pair(3, 135), Pair(3, 197),
            // An-Nisa
            Pair(4, 16), Pair(4, 22), Pair(4, 25), Pair(4, 77), Pair(4, 95),
            // Al-Maida
            Pair(5, 33), Pair(5, 41),
            // Al-An'am
            Pair(6, 151),
            // Al-A'raf
            Pair(7, 27), Pair(7, 28), Pair(7, 33), Pair(7, 46), Pair(7, 102),
            // Yunus
            Pair(10, 70),
            // Hud
            Pair(11, 64), Pair(11, 78),
            // Yusuf
            Pair(12, 23), Pair(12, 34), Pair(12, 50), Pair(12, 53),
            // Ibrahim
            Pair(14, 30),
            // Al-Hijr
            Pair(15, 17),
            // An-Nahl
            Pair(16, 10),
            // Al-Isra
            Pair(17, 16), Pair(17, 32), Pair(17, 45),
            // Maryam
            Pair(19, 17), Pair(19, 18), Pair(19, 20), Pair(19, 28),
            // Ta-Ha
            Pair(20, 31),
            // Al-Anbiya
            Pair(21, 74), Pair(21, 91),
            // Al-Mu’minun
            Pair(23, 56),
            // An-Nur
            Pair(24, 2), Pair(24, 3), Pair(24, 19), Pair(24, 21), Pair(24, 26), Pair(24, 28), Pair(24, 30), Pair(24, 31), Pair(24, 33),
            // Al-Furqan
            Pair(25, 53), Pair(25, 65),
            // Ash-Shu'ara
            Pair(26, 164), Pair(26, 207), Pair(26, 214),
            // Ar-Rahman
            Pair(55, 56), Pair(55, 74)
        )
    }

    fun Ayat_Sihr_Marshosh(): List<Pair<Int, Int>> {
        return listOf(
            Pair(1, 1),    // Surah Al-Fatiha (full surah)
            Pair(2, 255),  // Ayatul Kursi
            Pair(2, 102),  // Surah Al-Baqara 102
            Pair(2, 284),  // Surah Al-Baqara 284
            Pair(2, 285),  // Surah Al-Baqara 285
            Pair(2, 286),  // Surah Al-Baqara 286
            Pair(7, 117),  // Surah Al-A'raf 117
            Pair(7, 118),  // Surah Al-A'raf 118
            Pair(7, 119),  // Surah Al-A'raf 119
            Pair(7, 120),  // Surah Al-A'raf 120
            Pair(7, 121),  // Surah Al-A'raf 121
            Pair(7, 122),  // Surah Al-A'raf 122
            Pair(7, 139),  // Surah Al-A'raf 139
            Pair(10, 79),  // Surah Yunus 79
            Pair(10, 80),  // Surah Yunus 80
            Pair(10, 81),  // Surah Yunus 81
            Pair(10, 82),  // Surah Yunus 82
            Pair(20, 69),  // Surah Ta-Ha 69
            Pair(21, 18),  // Surah Al-Anbiya 18
            Pair(21, 70),  // Surah Al-Anbiya 70
            Pair(23, 23),  // Surah Al-Furqan 23
            Pair(37, 98),  // Surah As-Saffat 98
            Pair(43, 1),   // Surah Az-Zukhruf full surah start
            Pair(44, 1),   // Surah Ad-Dukhan full surah start
            Pair(45, 1),   // Surah Al-Jathiya full surah start
            Pair(46, 1),   // Surah Al-Ahqaf full surah start
            Pair(47, 1),   // Surah Muhammad full surah start
            Pair(48, 1),   // Surah Al-Fath full surah start
            Pair(112, 1),  // Surah Al-Ikhlas full surah start
            Pair(113, 1),  // Surah Al-Falaq full surah start
            Pair(114, 1)   // Surah An-Nas full surah start
        )
    }
    
    fun Ayat_Sihr_Tateel_Zawaj(): List<Pair<Int, Int>> {
        return listOf(
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7), // Al-Fatiha full surah
            Pair(2, 255),  // Ayatul Kursi
            Pair(13, 3),   // Ar-Ra'd 3
            Pair(20, 53),  // Ta-Ha 53
            Pair(7, 1),    // Al-A‘raf 1
            Pair(7, 189),  // Al-A‘raf 189
            Pair(36, 36),  // Ya-Sin 36
            Pair(51, 49),  // Az-Zariyat 49
            Pair(53, 45),  // An-Najm 45
            Pair(30, 21),  // Ar-Rum 21
            Pair(4, 19),   // An-Nisa 19
            Pair(66, 4)    // At-Tahrim 4
        )
    }

    fun Ayat_Sihr_Maqud(): List<Pair<Int, Int>> {
        return listOf(
            // Al-Fatiha full surah
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),

            // Ayatul Kursi
            Pair(2, 255),

            // Al-Baqarah selected verses
            Pair(2, 236), Pair(2, 237), Pair(2, 266), Pair(2, 284), Pair(2, 285), Pair(2, 286),

            // Yunus 81
            Pair(10, 81),

            // Taha 27
            Pair(20, 27),

            // Al-Furqan 23
            Pair(25, 23),

            // Al-Waqi’ah 6
            Pair(56, 6),

            // Al-Hijr 2
            Pair(15, 2),

            // Az-Zalzalah 2
            Pair(99, 2),

            // Al-Hashr 2
            Pair(59, 2),

            // Al-Falaq full surah
            Pair(113, 1), Pair(113, 2), Pair(113, 3), Pair(113, 4), Pair(113, 5),

            // An-Nas full surah
            Pair(114, 1), Pair(114, 2), Pair(114, 3), Pair(114, 4), Pair(114, 5), Pair(114, 6)
        )
    }

    fun Ayat_Sihr_Rabt(): List<Pair<Int, Int>> {
        return listOf(
            // Al-Fatiha full surah
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),

            // Al-Baqarah
            Pair(2, 102),

            // Al-A’raf 117–122
            Pair(7, 117), Pair(7, 118), Pair(7, 119),
            Pair(7, 120), Pair(7, 121), Pair(7, 122),

            // Yunus 81–82
            Pair(10, 81), Pair(10, 82),

            // Taha 69
            Pair(20, 69),

            // As-Sajda 7
            Pair(32, 7),

            // Al-Ikhlas full
            Pair(112, 1), Pair(112, 2), Pair(112, 3), Pair(112, 4),

            // Al-Falaq full
            Pair(113, 1), Pair(113, 2), Pair(113, 3), Pair(113, 4), Pair(113, 5),

            // An-Nas full
            Pair(114, 1), Pair(114, 2), Pair(114, 3), Pair(114, 4), Pair(114, 5), Pair(114, 6)
        )
    }

    fun Ayat_Sihr_Mahaba(): List<Pair<Int, Int>> {
        return listOf(
            // Surah Al-Fatihah (full surah)
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),

            // Ayatul Kursi
            Pair(2, 255),

            // Surah Al-Baqarah
            Pair(2, 30), Pair(2, 168), Pair(2, 169), Pair(2, 205),
            Pair(2, 219), Pair(2, 220), Pair(2, 221), Pair(2, 222),
            Pair(2, 275), Pair(2, 286),

            // Surah Aal Imran
            Pair(3, 14), Pair(3, 119), Pair(3, 135), Pair(3, 197),

            // Surah An-Nisa
            Pair(4, 16), Pair(4, 22), Pair(4, 25), Pair(4, 77), Pair(4, 95),

            // Surah Al-Ma’idah
            Pair(5, 33), Pair(5, 41),

            // Surah Al-An’am
            Pair(6, 151),

            // Surah Al-A’raf
            Pair(7, 27), Pair(7, 28), Pair(7, 33), Pair(7, 46), Pair(7, 102),

            // Surah Yunus
            Pair(10, 70),

            // Surah Hud
            Pair(11, 43), Pair(11, 64), Pair(11, 78),

            // Surah Yusuf
            Pair(12, 23), Pair(12, 24), Pair(12, 25), Pair(12, 26), Pair(12, 27),
            Pair(12, 28), Pair(12, 29), Pair(12, 30), Pair(12, 31), Pair(12, 32),
            Pair(12, 33), Pair(12, 34), Pair(12, 50), Pair(12, 51), Pair(12, 52),
            Pair(12, 53),

            // Surah Ibrahim
            Pair(14, 30),

            // Surah Al-Hijr
            Pair(15, 17),

            // Surah An-Nahl
            Pair(16, 60),

            // Surah Al-Isra
            Pair(17, 16), Pair(17, 32), Pair(17, 45),

            // Surah Al-Kahf
            Pair(18, 95),

            // Surah Maryam
            Pair(19, 17), Pair(19, 18), Pair(19, 20), Pair(19, 28),

            // Surah Taha
            Pair(20, 131),

            // Surah Al-Anbiya
            Pair(21, 74), Pair(21, 91),

            // Surah Al-Mu’minun
            Pair(23, 5), Pair(23, 6),

            // Surah An-Nur
            Pair(24, 2), Pair(24, 3), Pair(24, 19), Pair(24, 21),
            Pair(24, 26), Pair(24, 28), Pair(24, 30), Pair(24, 31), Pair(24, 33),

            // Surah Al-Furqan
            Pair(25, 53), Pair(25, 68),

            // Surah Ash-Shu‘ara
            Pair(26, 166), Pair(26, 207), Pair(26, 211),

            // Surah Al-Hajj
            Pair(22, 19), Pair(22, 22),

            // Surah Ar-Rahman
            Pair(55, 56), Pair(55, 74)
        )
    }



    val aynHasadVerses = listOf(
        // Al-Baqara
        Pair(2, 109),

        // An-Nisa
        Pair(4, 54),

        // At-Tawba
        Pair(9, 14), Pair(9, 15),

        // Yunus
        Pair(10, 57), Pair(10, 67),

        // Al-A'raf
        Pair(7, 82),

        // An-Nahl
        Pair(16, 68), Pair(16, 69),

        // Al-Kahf
        Pair(18, 39),

        // Ash-Shura
        Pair(26, 39),

        // Fussilat
        Pair(41, 44),

        // Al-Mulk
        Pair(67, 1), Pair(67, 2), Pair(67, 3), Pair(67, 4),

        // Al-Qalam
        Pair(68, 51),

        // Al-Ikhlas
        Pair(112, 1), Pair(112, 2), Pair(112, 3), Pair(112, 4),

        // Al-Falaq
        Pair(113, 1), Pair(113, 2), Pair(113, 3), Pair(113, 4), Pair(113, 5),

        // An-Nas
        Pair(114, 1), Pair(114, 2), Pair(114, 3), Pair(114, 4), Pair(114, 5), Pair(114, 6)
    )


    fun Ayat_Sihr_Madfun(): List<Pair<Int, Int>> {
        return listOf(
            Pair(9, 84),   // At-Tawba
            Pair(22, 7),   // Al-Hajj
            Pair(35, 22),  // Fatir
            Pair(36, 51),  // Ya-Sin
            Pair(54, 7),   // Al-Qamar
            Pair(60, 13),  // Al-Mumtahina
            Pair(70, 43),  // Al-Ma'arij
            Pair(77, 26),  // Al-Mursalat
            Pair(80, 21),  // Abasa
            Pair(82, 4),   // Al-Infitar
            Pair(100, 9),  // Al-Adiyat
            Pair(102, 2)   // At-Takathur
        )
    }



    fun Ayat_Sihr_Makul(): List<Pair<Int, Int>> {
        return listOf(
            // Al-Fatiha (Full Surah)
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),

            // Al-Baqara
            Pair(2, 102), Pair(2, 164), Pair(2, 174),
            Pair(2, 255), // Ayatul Kursi
            Pair(2, 284), Pair(2, 285), Pair(2, 286),

            // Aal Imran
            Pair(3, 18), Pair(3, 19),

            // An-Nisa
            Pair(4, 10),

            // Al-A'raf
            Pair(7, 54), Pair(7, 56),
            Pair(7, 117), Pair(7, 118), Pair(7, 119),
            Pair(7, 120), Pair(7, 121), Pair(7, 122),

            // At-Tawbah
            Pair(9, 14),

            // Yunus
            Pair(10, 79), Pair(10, 80), Pair(10, 81), Pair(10, 82),

            // Ibrahim
            Pair(14, 17),

            // An-Nahl
            Pair(16, 69),

            // Al-Kahf
            Pair(18, 29),

            // Al-Hajj
            Pair(22, 19), Pair(22, 20), Pair(22, 21), Pair(22, 22),

            // Al-Waqi'ah
            Pair(56, 51), Pair(56, 52), Pair(56, 53), Pair(56, 54),
            Pair(56, 55), Pair(56, 56), Pair(56, 57),

            // Ad-Dukhan
            Pair(44, 43), Pair(44, 44), Pair(44, 45), Pair(44, 46),
            Pair(44, 47), Pair(44, 48), Pair(44, 49), Pair(44, 50),

            // Muhammad
            Pair(47, 15),

            // Al-Jinn
            Pair(72, 1), Pair(72, 2), Pair(72, 3), Pair(72, 4),
            Pair(72, 5), Pair(72, 6), Pair(72, 7), Pair(72, 8), Pair(72, 9),

            // Al-Ikhlas (Full Surah)
            Pair(112, 1), Pair(112, 2), Pair(112, 3), Pair(112, 4),

            // Al-Falaq (Full Surah)
            Pair(113, 1), Pair(113, 2), Pair(113, 3), Pair(113, 4), Pair(113, 5),

            // An-Nas (Full Surah)
            Pair(114, 1), Pair(114, 2), Pair(114, 3), Pair(114, 4), Pair(114, 5), Pair(114, 6)
        )
    }



    fun Ayat_Jinn_Catching(): List<Pair<Int, Int>> {
        return listOf(
            // Summon the jinn
            Pair(2, 148),
            Pair(27, 30), Pair(27, 31),
            Pair(37, 158),
            Pair(36, 32),

            // If the jinn is mute
            Pair(55, 1), Pair(55, 2), Pair(55, 3), Pair(55, 4), Pair(55, 5),
            Pair(41, 21),
            Pair(113, 4),
            Pair(37, 92),
            Pair(20, 27), Pair(20, 28),
            Pair(51, 23),

            // If the jinn is violent or threatens
            Pair(25, 45),
            Pair(69, 30), Pair(69, 31), Pair(69, 32),
            Pair(6, 13),

            // If the jinn doesn't know God
            Pair(39, 62), Pair(39, 63),
            Pair(24, 35),
            Pair(2, 257),

            // If the jinn doesn't know Islam
            Pair(3, 19),
            Pair(51, 56),
            Pair(6, 162), Pair(6, 163),

            // If the jinn has pact with magician
            Pair(9, 1),

            // If the jinn lied about its color
            Pair(4, 145),

            // Find and destroy black magic
            Pair(50, 22),
            Pair(10, 81),
            Pair(59, 21),
            Pair(21, 30),
            Pair(25, 23),
            Pair(8, 11),
            Pair(16, 26),

            // Conditional verses
            Pair(21, 69),

            // If the jinn is afraid to leave
            Pair(30, 47),
            Pair(15, 21),

            // If the jinn doesn't want to leave
            Pair(99, 1), Pair(99, 2),
            Pair(35, 36), Pair(35, 37), Pair(35, 38),

            // If the jinn refuses to leave
            Pair(36, 82),
            Pair(4, 76),

            // If the jinn is afraid of other jinn
            Pair(17, 45),

            // If the jinn is afraid of sorcerer
            Pair(33, 3),

            // If the jinn is lying
            Pair(3, 61),
            Pair(17, 81),

            // If the jinn tries to run away
            Pair(76, 4),
            Pair(37, 24), Pair(37, 25), Pair(37, 26),
            Pair(86, 8), Pair(86, 9), Pair(86, 10), Pair(86, 11),
            Pair(86, 12), Pair(86, 13), Pair(86, 14), Pair(86, 15),
            Pair(86, 16), Pair(86, 17),

            // If the jinn asks who you are
            Pair(7, 196),

            // If the jinn's family has been killed
            Pair(30, 17), Pair(30, 18), Pair(30, 19),

            // If the jinn doesn't like its shape
            Pair(30, 30),

            // If the jinn says it is a king
            Pair(3, 26),
            Pair(38, 20),

            // If the jinn is a lover jinn
            Pair(30, 21),

            // If the jinn works with Satan
            Pair(35, 6),
            Pair(14, 22),

            // If the jinn is forgetful
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7),
            Pair(48, 4),
            Pair(95, 4),

            // To calm the jinn down
            Pair(36, 58),

            // To show the jinn Hell
            Pair(36, 64),

            // To show the jinn Paradise
            Pair(78, 31), Pair(78, 32), Pair(78, 33), Pair(78, 34), Pair(78, 35), Pair(78, 36)
        )
    }

    fun Ayat_Sihr_Tafreeq(): List<Pair<Int, Int>> {
        return listOf(
            Pair(1, 1), Pair(1, 2), Pair(1, 3), Pair(1, 4), Pair(1, 5), Pair(1, 6), Pair(1, 7), // Surah Fatiha
            Pair(2, 255), // Ayatul Kursi
            Pair(2, 102), // Surah Baqarah 102
            Pair(7, 117), Pair(7, 118), Pair(7, 119), Pair(7, 120), Pair(7, 121), Pair(7, 122), // Surah Araf 117–122
            Pair(10, 79), Pair(10, 80), Pair(10, 81), Pair(10, 82), // Surah Younus 79–82
            Pair(20, 69), // Surah Taha 69
            Pair(42, 43), Pair(42, 44), Pair(42, 45), Pair(42, 46), Pair(42, 47), Pair(42, 48), // Surah Shura 43–48
            Pair(112, 1), Pair(112, 2), Pair(112, 3), Pair(112, 4), // Surah Ikhlas full
            Pair(113, 1), Pair(113, 2), Pair(113, 3), Pair(113, 4), Pair(113, 5), // Surah Al-Falaq full
            Pair(114, 1), Pair(114, 2), Pair(114, 3), Pair(114, 4), Pair(114, 5), Pair(114, 6) // Surah An-Nas full
        )
    }


}