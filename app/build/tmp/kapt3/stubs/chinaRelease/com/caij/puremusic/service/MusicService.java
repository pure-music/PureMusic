package com.caij.puremusic.service;

import java.lang.System;

/**
 * @author Karim Abou Zeid (kabouzeid), Andrew Neal. Modified by Prathamesh More
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0080\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\u0080\u0002\u0081\u0002B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010u\u001a\u00020vH\u0002J\u000e\u0010w\u001a\u00020v2\u0006\u0010x\u001a\u00020#J\u0016\u0010w\u001a\u00020v2\u0006\u0010V\u001a\u00020\u00172\u0006\u0010x\u001a\u00020#J\u001e\u0010y\u001a\u00020v2\u0006\u0010V\u001a\u00020\u00172\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010{J\u0016\u0010y\u001a\u00020v2\u000e\u0010z\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010{J\u000e\u0010|\u001a\u00020v2\u0006\u0010}\u001a\u00020\u001dJ\u0006\u0010~\u001a\u00020vJ\u0006\u0010\u007f\u001a\u00020vJ\u001a\u0010\u0080\u0001\u001a\u00020v2\u0006\u0010x\u001a\u00020#2\u0007\u0010\u0081\u0001\u001a\u00020\u0017H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\u001dH\u0002J\t\u0010\u0083\u0001\u001a\u000207H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u0017H\u0002J\u0011\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\u001dH\u0002J\u0010\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0006\u0010V\u001a\u00020\u0017J\t\u0010\u0088\u0001\u001a\u00020\u0017H\u0002J\u0011\u0010\u0089\u0001\u001a\u00020#2\u0006\u0010V\u001a\u00020\u0017H\u0002J\u0010\u0010\u008a\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020XJ\u0012\u0010\u008c\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020XH\u0002J\t\u0010\u008d\u0001\u001a\u00020vH\u0002J\t\u0010\u008e\u0001\u001a\u00020\u001dH\u0002J\t\u0010\u008f\u0001\u001a\u00020\u001dH\u0002J\t\u0010\u0090\u0001\u001a\u00020\u001dH\u0002J/\u0010\u0091\u0001\u001a\u00020v2&\u0010\u0092\u0001\u001a!\u0012\u0016\u0012\u00140\u001d\u00a2\u0006\u000f\b\u0094\u0001\u0012\n\b\u0095\u0001\u0012\u0005\b\b(\u0096\u0001\u0012\u0004\u0012\u00020v0\u0093\u0001J\u0019\u0010\u0097\u0001\u001a\u00020v2\u0007\u0010\u0098\u0001\u001a\u00020\u00172\u0007\u0010\u0099\u0001\u001a\u00020\u0017J\u0012\u0010\u009a\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020XH\u0002J\u001b\u0010\u009b\u0001\u001a\u00020v2\u0007\u0010\u009c\u0001\u001a\u00020\u00172\u0007\u0010\u009d\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u009e\u0001\u001a\u00020?2\b\u0010\u009f\u0001\u001a\u00030\u00a0\u0001H\u0016J\t\u0010\u00a1\u0001\u001a\u00020vH\u0016J\t\u0010\u00a2\u0001\u001a\u00020vH\u0016J\u001d\u0010\u00a3\u0001\u001a\u00020v2\u0007\u0010\u00a4\u0001\u001a\u00020X2\t\u0010[\u001a\u0005\u0018\u00010\u00a5\u0001H\u0016J(\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\u0007\u0010\u00a8\u0001\u001a\u00020X2\u0007\u0010\u00a9\u0001\u001a\u00020\u00172\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u0001H\u0016J\u0012\u0010\u00ac\u0001\u001a\u00020v2\u0007\u0010\u00ad\u0001\u001a\u00020\u0017H\u0016J)\u0010\u00ae\u0001\u001a\u00020v2\u0007\u0010\u00af\u0001\u001a\u00020X2\u0015\u0010\u00b0\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00b2\u00010{0\u00b1\u0001H\u0016J\u001b\u0010\u00b3\u0001\u001a\u00020v2\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u00012\u0006\u0010x\u001a\u00020#H\u0002J\u001b\u0010\u00b6\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u00b7\u0001\u001a\u00020vH\u0016J\u001c\u0010\u00b8\u0001\u001a\u00020v2\b\u0010\u00b9\u0001\u001a\u00030\u00ba\u00012\u0007\u0010\u00a4\u0001\u001a\u00020XH\u0016J\'\u0010\u00bb\u0001\u001a\u00020\u00172\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u00012\u0007\u0010\u00bc\u0001\u001a\u00020\u00172\u0007\u0010\u00bd\u0001\u001a\u00020\u0017H\u0016J\t\u0010\u00be\u0001\u001a\u00020vH\u0016J\t\u0010\u00bf\u0001\u001a\u00020vH\u0016J\u0013\u0010\u00c0\u0001\u001a\u00020\u001d2\b\u0010\u009f\u0001\u001a\u00030\u00a0\u0001H\u0016J1\u0010\u00c1\u0001\u001a\u00020v2&\u0010\u0092\u0001\u001a!\u0012\u0016\u0012\u00140\u001d\u00a2\u0006\u000f\b\u0094\u0001\u0012\n\b\u0095\u0001\u0012\u0005\b\b(\u00c2\u0001\u0012\u0004\u0012\u00020v0\u0093\u0001H\u0002J)\u0010\u00c3\u0001\u001a\u00020v2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010{2\u0007\u0010\u00c4\u0001\u001a\u00020\u00172\u0007\u0010\u00c5\u0001\u001a\u00020\u001dJ7\u0010\u00c6\u0001\u001a\u00020v2\u0006\u0010V\u001a\u00020\u00172&\u0010\u0092\u0001\u001a!\u0012\u0016\u0012\u00140\u001d\u00a2\u0006\u000f\b\u0094\u0001\u0012\n\b\u0095\u0001\u0012\u0005\b\b(\u00c2\u0001\u0012\u0004\u0012\u00020v0\u0093\u0001J\u0011\u0010\u00c7\u0001\u001a\u00020v2\b\b\u0002\u0010}\u001a\u00020\u001dJ\u0007\u0010\u00c8\u0001\u001a\u00020vJ\u0013\u0010\u00c9\u0001\u001a\u00020v2\b\u0010\u009f\u0001\u001a\u00030\u00a0\u0001H\u0002J\u000f\u0010\u00ca\u0001\u001a\u00020v2\u0006\u0010}\u001a\u00020\u001dJ\u000f\u0010\u00cb\u0001\u001a\u00020v2\u0006\u0010}\u001a\u00020\u001dJ\u000f\u0010\u00cc\u0001\u001a\u00020v2\u0006\u0010V\u001a\u00020\u0017J\t\u0010\u00cd\u0001\u001a\u00020vH\u0002J\u0007\u0010\u00ce\u0001\u001a\u00020vJ\u0007\u0010\u00cf\u0001\u001a\u00020vJ\u0012\u0010\u00d0\u0001\u001a\u00020v2\u0007\u0010\u00d1\u0001\u001a\u00020\u0017H\u0002J\t\u0010\u00d2\u0001\u001a\u00020vH\u0002J\t\u0010\u00d3\u0001\u001a\u00020vH\u0002J\t\u0010\u00d4\u0001\u001a\u00020vH\u0002J\t\u0010\u00d5\u0001\u001a\u00020vH\u0002J\t\u0010\u00d6\u0001\u001a\u00020vH\u0002J\u000f\u0010\u00d7\u0001\u001a\u00020v2\u0006\u0010x\u001a\u00020#J\u000f\u0010\u00d7\u0001\u001a\u00020v2\u0006\u0010V\u001a\u00020\u0017J\u0011\u0010\u00d8\u0001\u001a\u00020v2\u0006\u0010x\u001a\u00020#H\u0002J\u0015\u0010\u00d9\u0001\u001a\u00020v2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020#0{J\u001b\u0010\u00da\u0001\u001a\u00020v2\u0007\u0010\u00db\u0001\u001a\u00020\u001d2\u0007\u0010\u00dc\u0001\u001a\u00020\u0017H\u0002J\u0013\u0010\u00dd\u0001\u001a\u00020vH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00de\u0001J\u0019\u0010\u00df\u0001\u001a\u00020v2\u0010\b\u0002\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020v0\u00e0\u0001J\u001a\u0010\u00e1\u0001\u001a\u00020v2\u0011\u0010\u00e2\u0001\u001a\f\u0018\u00010\u00e3\u0001j\u0005\u0018\u0001`\u00e4\u0001J\t\u0010\u00e5\u0001\u001a\u00020vH\u0002J\u0007\u0010\u00e6\u0001\u001a\u00020vJ\t\u0010\u00e7\u0001\u001a\u00020vH\u0002J\u0010\u0010\u00e8\u0001\u001a\u00020\u00172\u0007\u0010\u00e9\u0001\u001a\u00020\u0017J\u0012\u0010\u00ea\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020XH\u0002J\u0010\u0010\u00eb\u0001\u001a\u00020v2\u0007\u0010\u008b\u0001\u001a\u00020XJ\u0013\u0010\u00ec\u0001\u001a\u00020v2\b\u0010\u00ed\u0001\u001a\u00030\u00ee\u0001H\u0002J\u0011\u0010\u00ef\u0001\u001a\u00020v2\u0006\u0010V\u001a\u00020\u0017H\u0002J\u000f\u0010\u00f0\u0001\u001a\u00020v2\u0006\u0010c\u001a\u00020\u0017J\u0019\u0010\u00f1\u0001\u001a\u00020v2\u0006\u0010V\u001a\u00020\u00172\u0006\u0010x\u001a\u00020#H\u0002J\t\u0010\u00f2\u0001\u001a\u00020vH\u0002J\t\u0010\u00f3\u0001\u001a\u00020vH\u0002J\t\u0010\u00f4\u0001\u001a\u00020vH\u0002J\t\u0010\u00f5\u0001\u001a\u00020vH\u0002J\u0007\u0010\u00f6\u0001\u001a\u00020vJ\u0011\u0010\u00f7\u0001\u001a\u00020v2\b\u0010\u00f8\u0001\u001a\u00030\u00f9\u0001J\u0007\u0010\u00fa\u0001\u001a\u00020vJ\u0007\u0010\u00fb\u0001\u001a\u00020vJ\u0019\u0010\u00fc\u0001\u001a\u00020v2\u000e\u0010\u00fd\u0001\u001a\t\u0012\u0004\u0012\u00020v0\u00e0\u0001H\u0007J\u0007\u0010\u00fe\u0001\u001a\u00020vJ\t\u0010\u00ff\u0001\u001a\u00020vH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010+R\u000e\u0010-\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010B\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010C\u001a\u0004\u0018\u00010#8F\u00a2\u0006\u0006\u001a\u0004\bD\u0010%R\u000e\u0010E\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020#0IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010K\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010L\u001a\u0004\u0018\u00010M8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020#0I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010V\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010XX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\\\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\u0017@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0019\"\u0004\b^\u0010_R\u000e\u0010`\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010c\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010d\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\be\u0010\u0019R\u000e\u0010f\u001a\u00020gX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010h\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\bi\u0010\u0019R\u000e\u0010j\u001a\u00020kX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010mX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010q\u001a\b\u0018\u00010rR\u00020sX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0082\u0002"}, d2 = {"Lcom/caij/puremusic/service/MusicService;", "Landroidx/media/MediaBrowserServiceCompat;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Lcom/caij/puremusic/service/playback/Playback$PlaybackCallbacks;", "Lcom/caij/puremusic/volume/OnAudioVolumeChangedListener;", "Lcom/caij/puremusic/EventObserver;", "Lcom/caij/puremusic/service/LyricsProgressCallback;", "()V", "appWidgetBig", "Lcom/caij/puremusic/appwidgets/AppWidgetBig;", "appWidgetCard", "Lcom/caij/puremusic/appwidgets/AppWidgetCard;", "appWidgetCircle", "Lcom/caij/puremusic/appwidgets/AppWidgetCircle;", "appWidgetClassic", "Lcom/caij/puremusic/appwidgets/AppWidgetClassic;", "appWidgetMd3", "Lcom/caij/puremusic/appwidgets/AppWidgetMD3;", "appWidgetSmall", "Lcom/caij/puremusic/appwidgets/AppWidgetSmall;", "appWidgetText", "Lcom/caij/puremusic/appwidgets/AppWidgetText;", "audioSessionId", "", "getAudioSessionId", "()I", "bluetoothConnectedIntentFilter", "Landroid/content/IntentFilter;", "bluetoothConnectedRegistered", "", "bluetoothReceiver", "Landroid/content/BroadcastReceiver;", "bufferedPosition", "getBufferedPosition", "currentSong", "Lcom/caij/puremusic/db/model/Song;", "getCurrentSong", "()Lcom/caij/puremusic/db/model/Song;", "headsetReceiver", "headsetReceiverIntentFilter", "headsetReceiverRegistered", "isForeground", "isLastTrack", "()Z", "isPlaying", "lockScreenReceiver", "mLibraryViewModel", "Lcom/caij/puremusic/fragments/LibraryViewModel;", "mMainHandler", "Landroid/os/Handler;", "mMusicPlaybackQueueStore", "Lcom/caij/puremusic/providers/MusicPlaybackQueueStore;", "mMusicProvider", "Lcom/caij/puremusic/auto/AutoMusicProvider;", "mPackageValidator", "Lcom/caij/puremusic/util/PackageValidator;", "mRoomRepository", "Lcom/caij/puremusic/repository/RoomRepository;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaStoreObserver", "Landroid/database/ContentObserver;", "musicBind", "Landroid/os/IBinder;", "musicPlayerHandlerThread", "Landroid/os/HandlerThread;", "nextPosition", "nextSong", "getNextSong", "notHandledMetaChangedForCurrentTrack", "notificationManager", "Landroid/app/NotificationManager;", "originalPlayingQueue", "Ljava/util/ArrayList;", "pausedByZeroVolume", "pendingQuit", "playback", "Lcom/caij/puremusic/service/playback/Playback;", "getPlayback", "()Lcom/caij/puremusic/service/playback/Playback;", "playbackManager", "Lcom/caij/puremusic/service/PlaybackManager;", "playerHandler", "playingNotification", "Lcom/caij/puremusic/service/notification/PlayingNotification;", "playingQueue", "position", "preShowLyrics", "", "queuesRestored", "receivedHeadsetConnected", "value", "repeatMode", "getRepeatMode", "setRepeatMode", "(I)V", "savePositionHandler", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "shuffleMode", "songDurationMillis", "getSongDurationMillis", "songPlayCountHelper", "Lcom/caij/puremusic/service/SongPlayCountHelper;", "songProgressMillis", "getSongProgressMillis", "statusBarLyric", "LStatusBarLyric/API/StatusBarLyric;", "throttledSeekHandler", "Lcom/caij/puremusic/service/ThrottledSeekHandler;", "trackEndedByCrossfade", "uiThreadHandler", "updateFavoriteReceiver", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "widgetIntentReceiver", "acquireWakeLock", "", "addSong", "song", "addSongs", "songs", "", "back", "force", "clearQueue", "cycleRepeatMode", "deleteCacheUrl", "extra", "getNextPosition", "getPackageValidator", "getPosition", "getPreviousPosition", "getQueueDurationMillis", "", "getShuffleMode", "getSongAt", "handleAndSendChangeInternal", "what", "handleChangeInternal", "initNotification", "isCanLyric", "isCanLyricMeizu", "isCanLyricMo", "isCurrentFavorite", "completion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isFavorite", "moveSong", "from", "to", "notifyChange", "onAudioVolumeChanged", "currentVolume", "maxVolume", "onBind", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onEvent", "key", "", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "clientUid", "rootHints", "Landroid/os/Bundle;", "onLineUpdate", "line", "onLoadChildren", "parentId", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "onMediaMetadata", "mediaMetadata", "Lcom/google/android/exoplayer2/MediaMetadata;", "onPlayError", "onPlayStateChanged", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "onStartCommand", "flags", "startId", "onTrackEnded", "onTrackEndedWithCrossfade", "onUnbind", "openCurrent", "success", "openQueue", "startPosition", "startPlaying", "openTrackAndPrepareNextAt", "pause", "play", "playFromPlaylist", "playNextSong", "playPreviousSong", "playSongAt", "prepareNext", "prepareNextImpl", "quit", "rePosition", "deletedPosition", "registerBluetoothConnected", "registerContentObserver", "registerHeadsetEvents", "releaseResources", "releaseWakeLock", "removeSong", "removeSongImpl", "removeSongs", "restorePlaybackState", "wasPlaying", "progress", "restoreQueuesAndPositionIfNecessary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restoreState", "Lkotlin/Function0;", "runOnUiThread", "runnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "savePosition", "savePositionInTrack", "saveQueues", "seek", "millis", "sendChangeInternal", "sendPublicIntent", "setCustomAction", "stateBuilder", "Landroid/support/v4/media/session/PlaybackStateCompat$Builder;", "setPosition", "setShuffleMode", "setSongAt", "setupMediaSession", "startForegroundOrNotify", "stopForegroundAndNotification", "stopLycisc", "switchToLocalPlayback", "switchToRemotePlayback", "castPlayer", "Lcom/caij/puremusic/service/CastPlayer;", "toggleFavorite", "toggleShuffle", "updateMediaSessionMetaData", "onCompletion", "updateMediaSessionPlaybackState", "updateNotification", "Companion", "MusicBinder", "app_chinaRelease"})
public final class MusicService extends androidx.media.MediaBrowserServiceCompat implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, com.caij.puremusic.service.playback.Playback.PlaybackCallbacks, com.caij.puremusic.volume.OnAudioVolumeChangedListener, com.caij.puremusic.EventObserver, com.caij.puremusic.service.LyricsProgressCallback {
    private StatusBarLyric.API.StatusBarLyric statusBarLyric;
    private java.lang.String preShowLyrics;
    private final android.os.IBinder musicBind = null;
    @kotlin.jvm.JvmField()
    public int nextPosition = -1;
    @kotlin.jvm.JvmField()
    public boolean pendingQuit = false;
    private com.caij.puremusic.service.PlaybackManager playbackManager;
    private com.caij.puremusic.util.PackageValidator mPackageValidator;
    private final com.caij.puremusic.auto.AutoMusicProvider mMusicProvider = null;
    private final com.caij.puremusic.providers.MusicPlaybackQueueStore mMusicPlaybackQueueStore = null;
    private final com.caij.puremusic.repository.RoomRepository mRoomRepository = null;
    private final com.caij.puremusic.fragments.LibraryViewModel mLibraryViewModel = null;
    private boolean trackEndedByCrossfade = false;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    @kotlin.jvm.JvmField()
    public int position = -1;
    private final com.caij.puremusic.appwidgets.AppWidgetBig appWidgetBig = null;
    private final com.caij.puremusic.appwidgets.AppWidgetCard appWidgetCard = null;
    private final com.caij.puremusic.appwidgets.AppWidgetClassic appWidgetClassic = null;
    private final com.caij.puremusic.appwidgets.AppWidgetSmall appWidgetSmall = null;
    private final com.caij.puremusic.appwidgets.AppWidgetText appWidgetText = null;
    private final com.caij.puremusic.appwidgets.AppWidgetMD3 appWidgetMd3 = null;
    private final com.caij.puremusic.appwidgets.AppWidgetCircle appWidgetCircle = null;
    private final android.content.BroadcastReceiver widgetIntentReceiver = null;
    private final android.content.IntentFilter bluetoothConnectedIntentFilter = null;
    private boolean bluetoothConnectedRegistered = false;
    private final android.content.IntentFilter headsetReceiverIntentFilter = null;
    private boolean headsetReceiverRegistered = false;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private android.database.ContentObserver mediaStoreObserver;
    private android.os.HandlerThread musicPlayerHandlerThread;
    private boolean notHandledMetaChangedForCurrentTrack = false;
    private java.util.ArrayList<com.caij.puremusic.db.model.Song> originalPlayingQueue;
    private android.os.Handler mMainHandler;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public java.util.ArrayList<com.caij.puremusic.db.model.Song> playingQueue;
    private android.os.Handler playerHandler;
    private com.caij.puremusic.service.notification.PlayingNotification playingNotification;
    private final android.content.BroadcastReceiver updateFavoriteReceiver = null;
    private final android.content.BroadcastReceiver lockScreenReceiver = null;
    private boolean queuesRestored = false;
    private int repeatMode = 0;
    @kotlin.jvm.JvmField()
    public int shuffleMode = 0;
    private final com.caij.puremusic.service.SongPlayCountHelper songPlayCountHelper = null;
    private final android.content.BroadcastReceiver bluetoothReceiver = null;
    private boolean receivedHeadsetConnected = false;
    private final android.content.BroadcastReceiver headsetReceiver = null;
    private com.caij.puremusic.service.ThrottledSeekHandler throttledSeekHandler;
    private android.os.Handler uiThreadHandler;
    private android.os.PowerManager.WakeLock wakeLock;
    private android.app.NotificationManager notificationManager;
    private boolean isForeground = false;
    private android.os.Handler savePositionHandler;
    private boolean pausedByZeroVolume = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.caij.puremusic.service.MusicService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final int PRELOAD_SONG = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETRO_MUSIC_PACKAGE_NAME = "code.name.monkey.retromusic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MUSIC_PACKAGE_NAME = "com.android.music";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_TOGGLE_PAUSE = "code.name.monkey.retromusic.togglepause";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PLAY = "code.name.monkey.retromusic.play";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PLAY_PLAYLIST = "code.name.monkey.retromusic.play.playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PAUSE = "code.name.monkey.retromusic.pause";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_STOP = "code.name.monkey.retromusic.stop";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_SKIP = "code.name.monkey.retromusic.skip";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REWIND = "code.name.monkey.retromusic.rewind";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_QUIT = "code.name.monkey.retromusic.quitservice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PENDING_QUIT = "code.name.monkey.retromusic.pendingquitservice";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_PLAYLIST = "code.name.monkey.retromusicintentextra.playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_SHUFFLE_MODE = "code.name.monkey.retromusic.intentextra.shufflemode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_WIDGET_UPDATE = "code.name.monkey.retromusic.appreciate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_APP_WIDGET_NAME = "code.name.monkey.retromusicapp_widget_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String META_CHANGED = "code.name.monkey.retromusic.metachanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUEUE_CHANGED = "code.name.monkey.retromusic.queuechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_STATE_CHANGED = "code.name.monkey.retromusic.playstatechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAVORITE_STATE_CHANGED = "code.name.monkey.retromusic.favoritestatechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REPEAT_MODE_CHANGED = "code.name.monkey.retromusic.repeatmodechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHUFFLE_MODE_CHANGED = "code.name.monkey.retromusic.shufflemodechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA_STORE_CHANGED = "code.name.monkey.retromusic.mediastorechanged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CYCLE_REPEAT = "code.name.monkey.retromusic.cyclerepeat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_SHUFFLE = "code.name.monkey.retromusic.toggleshuffle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_FAVORITE = "code.name.monkey.retromusic.togglefavorite";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVED_PLAYING_SONG_ID = "saved_playing_song_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVED_POSITION_IN_TRACK = "POSITION_IN_TRACK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVED_SHUFFLE_MODE = "SHUFFLE_MODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVED_REPEAT_MODE = "REPEAT_MODE";
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int SHUFFLE_MODE_SHUFFLE = 1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ALL = 1;
    public static final int REPEAT_MODE_THIS = 2;
    private static final long MEDIA_SESSION_ACTIONS = 823L;
    
    public MusicService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.service.playback.Playback getPlayback() {
        return null;
    }
    
    public final int getRepeatMode() {
        return 0;
    }
    
    private final void setRepeatMode(int value) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void registerContentObserver() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void acquireWakeLock() {
    }
    
    @java.lang.Override()
    public void onAudioVolumeChanged(int currentVolume, int maxVolume) {
    }
    
    public final void addSong(int position, @org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    public final void addSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    public final void addSongs(int position, @org.jetbrains.annotations.Nullable()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    public final void addSongs(@org.jetbrains.annotations.Nullable()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    public final void back(boolean force) {
    }
    
    public final void clearQueue() {
    }
    
    public final void cycleRepeatMode() {
    }
    
    public final int getAudioSessionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.caij.puremusic.db.model.Song getCurrentSong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.caij.puremusic.db.model.Song getNextSong() {
        return null;
    }
    
    private final int getNextPosition(boolean force) {
        return 0;
    }
    
    private final int getPosition() {
        return 0;
    }
    
    private final void setPosition(int position) {
    }
    
    private final int getPreviousPosition(boolean force) {
        return 0;
    }
    
    public final long getQueueDurationMillis(int position) {
        return 0L;
    }
    
    private final int getShuffleMode() {
        return 0;
    }
    
    public final void setShuffleMode(int shuffleMode) {
    }
    
    private final com.caij.puremusic.db.model.Song getSongAt(int position) {
        return null;
    }
    
    private final void setSongAt(int position, com.caij.puremusic.db.model.Song song) {
    }
    
    public final int getSongDurationMillis() {
        return 0;
    }
    
    public final int getSongProgressMillis() {
        return 0;
    }
    
    public final int getBufferedPosition() {
        return 0;
    }
    
    public final void handleAndSendChangeInternal(@org.jetbrains.annotations.NotNull()
    java.lang.String what) {
    }
    
    private final void initNotification() {
    }
    
    private final boolean isLastTrack() {
        return false;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void moveSong(int from, int to) {
    }
    
    private final void notifyChange(java.lang.String what) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String clientPackageName, int clientUid, @org.jetbrains.annotations.Nullable()
    android.os.Bundle rootHints) {
        return null;
    }
    
    private final com.caij.puremusic.util.PackageValidator getPackageValidator() {
        return null;
    }
    
    @java.lang.Override()
    public void onLoadChildren(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onTrackEnded() {
    }
    
    @java.lang.Override()
    public void onTrackEndedWithCrossfade() {
    }
    
    private final void onMediaMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata, com.caij.puremusic.db.model.Song song) {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onPlayError(int what, int extra) {
    }
    
    private final void deleteCacheUrl(com.caij.puremusic.db.model.Song song, int extra) {
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return false;
    }
    
    public final void openQueue(@org.jetbrains.annotations.Nullable()
    java.util.List<com.caij.puremusic.db.model.Song> playingQueue, int startPosition, boolean startPlaying) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void openTrackAndPrepareNextAt(int position, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    public final void pause(boolean force) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void play() {
    }
    
    public final void playNextSong(boolean force) {
    }
    
    public final void playPreviousSong(boolean force) {
    }
    
    public final void playSongAt(int position) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void prepareNextImpl() {
    }
    
    public final void toggleFavorite() {
    }
    
    public final void isCurrentFavorite(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    public final void quit() {
    }
    
    private final void releaseWakeLock() {
    }
    
    public final void removeSong(int position) {
    }
    
    private final void removeSongImpl(com.caij.puremusic.db.model.Song song) {
    }
    
    public final void removeSong(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.db.model.Song song) {
    }
    
    public final void removeSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.caij.puremusic.db.model.Song> songs) {
    }
    
    private final void rePosition(int deletedPosition) {
    }
    
    private final java.lang.Object restoreQueuesAndPositionIfNecessary(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void runOnUiThread(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable runnable) {
    }
    
    public final void savePositionInTrack() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized int seek(int millis) {
        return 0;
    }
    
    public final void sendPublicIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String what) {
    }
    
    public final void toggleShuffle() {
    }
    
    public final void updateMediaSessionPlaybackState() {
    }
    
    private final void updateNotification() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void updateMediaSessionMetaData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCompletion) {
    }
    
    private final void handleChangeInternal(java.lang.String what) {
    }
    
    private final void stopLycisc() {
    }
    
    private final boolean isCanLyric() {
        return false;
    }
    
    private final boolean isCanLyricMeizu() {
        return false;
    }
    
    private final boolean isCanLyricMo() {
        return false;
    }
    
    private final void startForegroundOrNotify() {
    }
    
    private final void stopForegroundAndNotification() {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void openCurrent(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
    }
    
    public final void switchToLocalPlayback() {
    }
    
    public final void switchToRemotePlayback(@org.jetbrains.annotations.NotNull()
    com.caij.puremusic.service.CastPlayer castPlayer) {
    }
    
    private final void restorePlaybackState(boolean wasPlaying, int progress) {
    }
    
    private final void playFromPlaylist(android.content.Intent intent) {
    }
    
    private final void prepareNext() {
    }
    
    private final void registerBluetoothConnected() {
    }
    
    private final void registerHeadsetEvents() {
    }
    
    private final void releaseResources() {
    }
    
    public final void restoreState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> completion) {
    }
    
    private final void savePosition() {
    }
    
    private final void saveQueues() {
    }
    
    private final void sendChangeInternal(java.lang.String what) {
    }
    
    private final void setCustomAction(android.support.v4.media.session.PlaybackStateCompat.Builder stateBuilder) {
    }
    
    private final void setupMediaSession() {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @java.lang.Override()
    public void onLineUpdate(int line) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/caij/puremusic/service/MusicService$MusicBinder;", "Landroid/os/Binder;", "(Lcom/caij/puremusic/service/MusicService;)V", "service", "Lcom/caij/puremusic/service/MusicService;", "getService", "()Lcom/caij/puremusic/service/MusicService;", "app_chinaRelease"})
    public final class MusicBinder extends android.os.Binder {
        
        public MusicBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.caij.puremusic.service.MusicService getService() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/caij/puremusic/service/MusicService$Companion;", "", "()V", "ACTION_PAUSE", "", "ACTION_PENDING_QUIT", "ACTION_PLAY", "ACTION_PLAY_PLAYLIST", "ACTION_QUIT", "ACTION_REWIND", "ACTION_SKIP", "ACTION_STOP", "ACTION_TOGGLE_PAUSE", "APP_WIDGET_UPDATE", "CYCLE_REPEAT", "EXTRA_APP_WIDGET_NAME", "FAVORITE_STATE_CHANGED", "INTENT_EXTRA_PLAYLIST", "INTENT_EXTRA_SHUFFLE_MODE", "MEDIA_SESSION_ACTIONS", "", "MEDIA_STORE_CHANGED", "META_CHANGED", "MUSIC_PACKAGE_NAME", "PLAY_STATE_CHANGED", "PRELOAD_SONG", "", "QUEUE_CHANGED", "REPEAT_MODE_ALL", "REPEAT_MODE_CHANGED", "REPEAT_MODE_NONE", "REPEAT_MODE_THIS", "RETRO_MUSIC_PACKAGE_NAME", "SAVED_PLAYING_SONG_ID", "SAVED_POSITION_IN_TRACK", "SAVED_REPEAT_MODE", "SAVED_SHUFFLE_MODE", "SHUFFLE_MODE_CHANGED", "SHUFFLE_MODE_NONE", "SHUFFLE_MODE_SHUFFLE", "TAG", "getTAG", "()Ljava/lang/String;", "TOGGLE_FAVORITE", "TOGGLE_SHUFFLE", "app_chinaRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
    }
}