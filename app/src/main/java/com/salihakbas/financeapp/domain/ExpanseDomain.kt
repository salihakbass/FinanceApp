package com.salihakbas.financeapp.domain

import android.os.Parcel
import android.os.Parcelable

data class ExpanseDomain(
    val title: String = "",
    val price: Double = 0.0,
    val pic: String = "",
    val time: String = ""

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readDouble(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeDouble(price)
        parcel.writeString(pic)
        parcel.writeString(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ExpanseDomain> {
        override fun createFromParcel(parcel: Parcel): ExpanseDomain {
            return ExpanseDomain(parcel)
        }

        override fun newArray(size: Int): Array<ExpanseDomain?> {
            return arrayOfNulls(size)
        }
    }

}
