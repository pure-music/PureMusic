<?php
    $code = $_GET["code"];
    $url = "puremusic://music.caij.xyz/dropbox?code=".$code;
    echo $url;
    header('Location: '.$url, true, 302);
?>


