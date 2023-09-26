package com.caij.puremusic.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caij on 2017/2/1.
 */

@Keep
public class UpdateInfo implements Parcelable {

    @SerializedName("versionCode")
    public int versionCode;
    @SerializedName("versionName")
    public String versionName;
    @SerializedName("type")
    public int type;
    @SerializedName("appId")
    public String appId;
    @SerializedName("name")
    public String name;
    @SerializedName("desc")
    public String desc;
    @SerializedName("url")
    public String url;
    @SerializedName("createTime")
    public long createTime;
    @SerializedName("fileSize")
    public long fileSize;
    @SerializedName("forcedUpgradeInfo")
    public ForcedUpgradeInfo forcedUpgradeInfo;
    @SerializedName("sha1")
    public String sha1;
    @SerializedName("md5")
    public String md5;
    @SerializedName("isAlter")
    public boolean isAlter;
    @SerializedName("isGray")
    public boolean isGray;
    @SerializedName("isCanIgnore")
    public boolean isCanIgnore;

    @Keep
    public static class ForcedUpgradeInfo implements Parcelable {
        @SerializedName("minVersionCode")
        public int minVersionCode;
        @SerializedName("forcedUpgradeVersionCodes")
        public List<Integer> forcedUpgradeVersionCodes;


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.minVersionCode);
            dest.writeList(this.forcedUpgradeVersionCodes);
        }

        public ForcedUpgradeInfo() {
        }

        protected ForcedUpgradeInfo(Parcel in) {
            this.minVersionCode = in.readInt();
            this.forcedUpgradeVersionCodes = new ArrayList<Integer>();
            in.readList(this.forcedUpgradeVersionCodes, Integer.class.getClassLoader());
        }

        public static final Creator<ForcedUpgradeInfo> CREATOR = new Creator<ForcedUpgradeInfo>() {
            @Override
            public ForcedUpgradeInfo createFromParcel(Parcel source) {
                return new ForcedUpgradeInfo(source);
            }

            @Override
            public ForcedUpgradeInfo[] newArray(int size) {
                return new ForcedUpgradeInfo[size];
            }
        };
    }


    public UpdateInfo() {
    }

    protected UpdateInfo(Parcel in) {
        versionCode = in.readInt();
        versionName = in.readString();
        type = in.readInt();
        appId = in.readString();
        name = in.readString();
        desc = in.readString();
        url = in.readString();
        createTime = in.readLong();
        fileSize = in.readLong();
        forcedUpgradeInfo = in.readParcelable(ForcedUpgradeInfo.class.getClassLoader());
        sha1 = in.readString();
        md5 = in.readString();
        isAlter = in.readByte() != 0;
        isGray = in.readByte() != 0;
        isCanIgnore = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(versionCode);
        dest.writeString(versionName);
        dest.writeInt(type);
        dest.writeString(appId);
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(url);
        dest.writeLong(createTime);
        dest.writeLong(fileSize);
        dest.writeParcelable(forcedUpgradeInfo, flags);
        dest.writeString(sha1);
        dest.writeString(md5);
        dest.writeByte((byte) (isAlter ? 1 : 0));
        dest.writeByte((byte) (isGray ? 1 : 0));
        dest.writeByte((byte) (isCanIgnore ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<UpdateInfo> CREATOR = new Creator<UpdateInfo>() {
        @Override
        public UpdateInfo createFromParcel(Parcel in) {
            return new UpdateInfo(in);
        }

        @Override
        public UpdateInfo[] newArray(int size) {
            return new UpdateInfo[size];
        }
    };
}
