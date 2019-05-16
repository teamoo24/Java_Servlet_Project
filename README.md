#参考サイト : http://web.javastudy.biz/?p=160


#Macのポートの締め方

        --ポート番号 1080 の場合

                lsof -i -P | grep 1080

        --ヒットしたら表示されます。

                java  5328 narikei 5u IPv6 0x1d1d1d1d1d1d1d1d1d 0t0  TCP *:1080 (LISTEN)

        --PIDが分かったのでKILL

                kill -9 5328
