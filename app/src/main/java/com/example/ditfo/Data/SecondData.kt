package com.example.ditfo.Data

import android.os.Parcel
import android.os.Parcelable

data class SecondData(
    val head: String?,
    val title: String?,
    val image: Int,
    val subtitle: String?,
    val describe: String?,
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(head)
        parcel.writeString(title)
        parcel.writeInt(image)
        parcel.writeString(subtitle)
        parcel.writeString(describe)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SecondData> {
        override fun createFromParcel(parcel: Parcel): SecondData {
            return SecondData(parcel)
        }

        override fun newArray(size: Int): Array<SecondData?> {
            return arrayOfNulls(size)
        }
    }
}