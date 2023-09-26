package com.caij.puremusic.util;

import java.lang.System;

/**
 * Validates that the calling package is authorized to browse a [MediaBrowserServiceCompat].
 *
 * The list of allowed signing certificates and their corresponding package names is defined in
 * res/xml/allowed_media_browser_callers.xml.
 *
 * If you want to add a new caller to allowed_media_browser_callers.xml and you don't know
 * its signature, this class will print to logcat (INFO level) a message with the proper
 * xml tags to add to allow the caller.
 *
 * For more information, see res/xml/allowed_media_browser_callers.xml.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\'()B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\tH\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0013H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/caij/puremusic/util/PackageValidator;", "", "context", "Landroid/content/Context;", "xmlResId", "", "(Landroid/content/Context;I)V", "callerChecked", "", "", "Lkotlin/Pair;", "", "certificateWhitelist", "", "Lcom/caij/puremusic/util/PackageValidator$KnownCallerInfo;", "packageManager", "Landroid/content/pm/PackageManager;", "platformSignature", "buildCallerInfo", "Lcom/caij/puremusic/util/PackageValidator$CallerPackageInfo;", "callingPackage", "buildCertificateWhitelist", "parser", "Landroid/content/res/XmlResourceParser;", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "getSignature", "packageInfo", "getSignatureSha256", "certificate", "", "getSystemSignature", "isKnownCaller", "callingUid", "logUnknownCaller", "", "callerPackageInfo", "parseV1Tag", "parseV2Tag", "CallerPackageInfo", "KnownCallerInfo", "KnownSignature", "app_chinaRelease"})
public final class PackageValidator {
    private final android.content.Context context = null;
    private final android.content.pm.PackageManager packageManager = null;
    private final java.util.Map<java.lang.String, com.caij.puremusic.util.PackageValidator.KnownCallerInfo> certificateWhitelist = null;
    private final java.lang.String platformSignature = null;
    private final java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Boolean>> callerChecked = null;
    
    public PackageValidator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.XmlRes()
    int xmlResId) {
        super();
    }
    
    /**
     * Checks whether the caller attempting to connect to a [MediaBrowserServiceCompat] is known.
     * See [MediaBrowserServiceCompat.onGetRoot] for where this is utilized.
     *
     * @param callingPackage The package name of the caller.
     * @param callingUid The user id of the caller.
     * @return `true` if the caller is known, `false` otherwise.
     */
    public final boolean isKnownCaller(@org.jetbrains.annotations.NotNull()
    java.lang.String callingPackage, int callingUid) {
        return false;
    }
    
    /**
     * Logs an info level message with details of how to add a caller to the allowed callers list
     * when the app is debuggable.
     */
    private final void logUnknownCaller(com.caij.puremusic.util.PackageValidator.CallerPackageInfo callerPackageInfo) {
    }
    
    /**
     * Builds a [CallerPackageInfo] for a given package that can be used for all the
     * various checks that are performed before allowing an app to connect to a
     * [MediaBrowserServiceCompat].
     */
    private final com.caij.puremusic.util.PackageValidator.CallerPackageInfo buildCallerInfo(java.lang.String callingPackage) {
        return null;
    }
    
    /**
     * Looks up the [PackageInfo] for a package name.
     * This requests both the signatures (for checking if an app is on the whitelist) and
     * the app's permissions, which allow for more flexibility in the whitelist.
     *
     * @return [PackageInfo] for the package name or null if it's not found.
     */
    @android.annotation.SuppressLint(value = {"PackageManagerGetSignatures"})
    @kotlin.Suppress(names = {"Deprecation"})
    private final android.content.pm.PackageInfo getPackageInfo(java.lang.String callingPackage) {
        return null;
    }
    
    /**
     * Gets the signature of a given package's [PackageInfo].
     *
     * The "signature" is a SHA-256 hash of the public key of the signing certificate used by
     * the app.
     *
     * If the app is not found, or if the app does not have exactly one signature, this method
     * returns `null` as the signature.
     */
    @kotlin.Suppress(names = {"deprecation"})
    private final java.lang.String getSignature(android.content.pm.PackageInfo packageInfo) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, com.caij.puremusic.util.PackageValidator.KnownCallerInfo> buildCertificateWhitelist(android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    /**
     * Parses a v1 format tag. See allowed_media_browser_callers.xml for more details.
     */
    private final com.caij.puremusic.util.PackageValidator.KnownCallerInfo parseV1Tag(android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    /**
     * Parses a v2 format tag. See allowed_media_browser_callers.xml for more details.
     */
    private final com.caij.puremusic.util.PackageValidator.KnownCallerInfo parseV2Tag(android.content.res.XmlResourceParser parser) {
        return null;
    }
    
    /**
     * Finds the Android platform signing key signature. This key is never null.
     */
    private final java.lang.String getSystemSignature() {
        return null;
    }
    
    /**
     * Creates a SHA-256 signature given a Base64 encoded certificate.
     */
    private final java.lang.String getSignatureSha256(java.lang.String certificate) {
        return null;
    }
    
    /**
     * Creates a SHA-256 signature given a certificate byte array.
     */
    private final java.lang.String getSignatureSha256(byte[] certificate) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/caij/puremusic/util/PackageValidator$KnownCallerInfo;", "", "name", "", "packageName", "signatures", "", "Lcom/caij/puremusic/util/PackageValidator$KnownSignature;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getName", "()Ljava/lang/String;", "getPackageName", "getSignatures", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_chinaRelease"})
    static final class KnownCallerInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<com.caij.puremusic.util.PackageValidator.KnownSignature> signatures = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.PackageValidator.KnownCallerInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.NotNull()
        java.util.Set<com.caij.puremusic.util.PackageValidator.KnownSignature> signatures) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public KnownCallerInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, @org.jetbrains.annotations.NotNull()
        java.util.Set<com.caij.puremusic.util.PackageValidator.KnownSignature> signatures) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<com.caij.puremusic.util.PackageValidator.KnownSignature> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<com.caij.puremusic.util.PackageValidator.KnownSignature> getSignatures() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/caij/puremusic/util/PackageValidator$KnownSignature;", "", "signature", "", "release", "", "(Ljava/lang/String;Z)V", "getRelease", "()Z", "getSignature", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_chinaRelease"})
    static final class KnownSignature {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String signature = null;
        private final boolean release = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.PackageValidator.KnownSignature copy(@org.jetbrains.annotations.NotNull()
        java.lang.String signature, boolean release) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public KnownSignature(@org.jetbrains.annotations.NotNull()
        java.lang.String signature, boolean release) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSignature() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getRelease() {
            return false;
        }
    }
    
    /**
     * Convenience class to hold all of the information about an app that's being checked
     * to see if it's a known caller.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/caij/puremusic/util/PackageValidator$CallerPackageInfo;", "", "name", "", "packageName", "uid", "", "signature", "permissions", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V", "getName", "()Ljava/lang/String;", "getPackageName", "getPermissions", "()Ljava/util/Set;", "getSignature", "getUid", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_chinaRelease"})
    static final class CallerPackageInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String packageName = null;
        private final int uid = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String signature = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> permissions = null;
        
        /**
         * Convenience class to hold all of the information about an app that's being checked
         * to see if it's a known caller.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.util.PackageValidator.CallerPackageInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, int uid, @org.jetbrains.annotations.Nullable()
        java.lang.String signature, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> permissions) {
            return null;
        }
        
        /**
         * Convenience class to hold all of the information about an app that's being checked
         * to see if it's a known caller.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Convenience class to hold all of the information about an app that's being checked
         * to see if it's a known caller.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Convenience class to hold all of the information about an app that's being checked
         * to see if it's a known caller.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CallerPackageInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String packageName, int uid, @org.jetbrains.annotations.Nullable()
        java.lang.String signature, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> permissions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPackageName() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getUid() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSignature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getPermissions() {
            return null;
        }
    }
}