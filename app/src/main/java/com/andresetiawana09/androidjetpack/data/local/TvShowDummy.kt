package com.andresetiawana09.androidjetpack.data.local

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowDummy(val title: String, val desc: String, val posterPath: String) : Parcelable

object TvDataDummy {
    fun generateDummyData(): ArrayList<TvShowDummy> {
        val tvData = ArrayList<TvShowDummy>()

        tvData.add(
            TvShowDummy(
                "Avenger",
                "Avenger is an anime series, produced by Bandai Visual, Bee Train and Xebec, and directed by Koichi Mashimo.",
                "/hO21A0vjPq7mrIV26EXBbi6wYYz.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns " +
                        "five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Fear the Walking Dead",
                "What did the world look like as it was transforming into the horrifying apocalypse " +
                        "depicted in \\\"The Walking Dead\\\"? This spin-off set in Los Angeles, " +
                        "following new characters as they face the beginning of the end of the world, will answer that question.",
                "/lZMb3R3e5vqukPbeDMeyYGf2ZNG.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by " +
                        "lightning and falls into a coma. Months later he awakens with the power of super speed," +
                        " granting him the ability to move through Central City like an unseen guardian angel.",
                "/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "The Simpsons",
                "Set in Springfield, the average American town, the show focuses on the antics" +
                        " and everyday adventures of the Simpson family",
                "/yTZQkSsxUFJZJe67IenRM0AEklc.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Ip Man 4: The Finale",
                "Ip Man 4 is an upcoming Hong Kong biographical martial arts film directed by Wilson " +
                        "Yip and produced by Raymond Wong.",
                "/mAWBfTDAmfpvQGMVFuzuVl49N1P.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. ",
                "/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "NCIS: Los Angeles",
                "The exploits of the Los Angeles–based Office of Special Projects (OSP), " +
                        "an elite division of the Naval Criminal Investigative Service that specializes in undercover assignments.",
                "/p0doUtM8RhXcAwHs6VmMZMQKpai.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Law & Order: Special Victims Unit",
                "In the criminal justice system, sexually-based offenses are considered especially heinous. In New York City," +
                        " the dedicated detectives who investigate " +
                        "these vicious felonies are members of an elite squad known as the Special Victims Unit.",
                "/p0doUtM8RhXcAwHs6VmMZMQKpai.jpg"
            )
        )
        tvData.add(
            TvShowDummy(
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty," +
                        " Veronica and their friends, exploring the surreality of small-town life," +
                        " the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg"
            )
        )
        return tvData
    }
}