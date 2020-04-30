package com.almetrix.playgroundtask.Pojo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Information (@SerializedName("s.no")var s_no: Int,
                        @SerializedName("amt.pledged")var amout_pledged: Int,
                        @SerializedName("blurb")var blurb: String,
                        @SerializedName("by")var by: String,
                        @SerializedName("country")var country: String,
                        @SerializedName("currency")var currency: String,
                        @SerializedName("end.time")var end_time: String,
                        @SerializedName("location")var location: String,
                        @SerializedName("percentage.funded")var percentage: String,
                        @SerializedName("num.backers")var no_of_banker: String,
                        @SerializedName("state")var state: String,
                        @SerializedName("title")var title: String,
                        @SerializedName("type")var type: String,
                        @SerializedName("url")var url: String)

@Entity
data class data_For_Database(@PrimaryKey @ColumnInfo(name ="s.no")var s_no: Int,
                             @ColumnInfo(name ="amt.pledged")var amout_pledged: Int,
                             @ColumnInfo(name ="blurb")var blurb: String,
                             @ColumnInfo(name ="by")var by: String,
                             @ColumnInfo(name ="country")var country: String,
                             @ColumnInfo(name ="currency")var currency: String,
                             @ColumnInfo(name ="end.time")var end_time: String,
                             @ColumnInfo(name ="location")var location: String,
                             @ColumnInfo(name ="percentage.funded")var percentage: String,
                             @ColumnInfo(name ="num.backers")var no_of_banker: String,
                             @ColumnInfo(name ="state")var state: String,
                             @ColumnInfo(name ="title")var title: String,
                             @ColumnInfo(name ="type")var type: String,
                             @ColumnInfo(name ="url")var url: String)











