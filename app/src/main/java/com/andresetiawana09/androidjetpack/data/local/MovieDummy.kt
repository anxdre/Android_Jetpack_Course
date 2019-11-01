package com.andresetiawana09.androidjetpack.data.local

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieDummy(val title: String, val desc: String, val posterPath: String) : Parcelable

object MovieDataDummy {
    fun generateDummyData(): ArrayList<MovieDummy> {
        val movieData = ArrayList<MovieDummy>()

        movieData.add(
            MovieDummy(
                "Joker",
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life " +
                        "of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                "/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Maleficent: Mistress of Evil",
                "Maleficent and her goddaughter Aurora begin to question the complex family ties that bind them as they " +
                        "are pulled in different directions by impending nuptials," +
                        " unexpected allies, and dark new forces at play.",
                "/vloNTScJ3w7jwNwtNGoG8DbTThv.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Spider-Man: Far from Home",
                "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to " +
                        "rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause " +
                        "natural disasters and destruction throughout the continent.",
                "/lcq8dVxeeOqHvvgcte707K0KVx5.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "El Camino: A Breaking Bad Movie",
                "In the wake of his dramatic escape from captivity, Jesse Pinkman must come " +
                        "to terms with his past in order to forge some kind of future.",
                "/ePXuKdXZuJx8hHMNr2yM4jY2L7Z.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Toy Story 4",
                "Woody has always been confident about his place in the world and that his priority is " +
                        "taking care of his kid, whether that's Andy or Bonnie.",
                "/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Ip Man 4: The Finale",
                "Ip Man 4 is an upcoming Hong Kong biographical martial arts film directed by Wilson " +
                        "Yip and produced by Raymond Wong.",
                "/mAWBfTDAmfpvQGMVFuzuVl49N1P.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Gemini Man",
                "Henry Brogen, an aging assassin tries to get out of the business but finds himself in the ultimate battle: " +
                        "fighting his own clone who" +
                        " is 25 years younger than him and at the peak of his abilities.",
                "/uTALxjQU8e1lhmNjP9nnJ3t2pRU.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Aladdin",
                "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that " +
                        "releases a wisecracking genie while a power-hungry Grand Vizier vies for the " +
                        "same lamp that has the power to make their deepest wishes come true.",
                "/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "It Chapter Two",
                "27 years after overcoming the malevolent supernatural entity Pennywise, the former members of the Losers' Club, " +
                        "who have grown up and moved away from Derry, are brought back together by a devastating phone call.",
                "/zfE0R94v1E8cuKAerbskfD3VfUt.jpg"
            )
        )
        movieData.add(
            MovieDummy(
                "Zombieland: Double Tap",
                "he group will face a new zombie threat as a new breed of zombie has developed. " +
                        "This new super-zombie type is faster, bigger, " +
                        "and stronger than the previous strain of zombies and harder to kill.",
                "/pIcV8XXIIvJCbtPoxF9qHMKdRr2.jpg"
            )
        )
        return movieData
    }
}