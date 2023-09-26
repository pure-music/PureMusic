package com.caij.puremusic.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/caij/puremusic/interfaces/IGenreClickListener;", "", "onClickGenre", "", "genre", "Lcom/caij/puremusic/model/Genre;", "view", "Landroid/view/View;", "app_chinaRelease"})
public abstract interface IGenreClickListener {
    
    public abstract void onClickGenre(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.View view);
}