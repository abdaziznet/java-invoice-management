# Aplikasi invoice Management #

Aplikasi ini dipakai untuk mengelola invoice dan menyambungkan dengan berbagai metode pembayaran masa kini 
Diantara metode pembayaran yang akan disupport antara lain:

* Virtual Account Bank
    * Bank BNI
    * Bank CIMB
    * Bank BSI

* e-Wallet 
    * Ovo
    * Gopay

* QR Payment
    * QRIS

Tipe tagihajn yang tersedia:

    * CLOSED : bayar sesuai nominal. kalau tidak sesuai ditolak
    * OPEN : pembayaran berapapun diterima
    * INSTALLMENT : pembayran diterima selama total akumulasi lebih kecil atau sama dengan nilai tagihan 


# Cara Setup Database #

1. Jalankan postgreSql di docker
    
    ```
    docker run --rm \
        --name invoice-db \
        -e POSTGRES_DB=invoicedb \
        -e POSTGRES_USER=invoice \
        -e POSTGRES_PASSWORD=PViwM7w7Tq5cL2N1cHLo \
        -e PGDATA=/var/lib/postgresql/data/pgdata \
        -v "$PWD/invoicedb-data:/var/lib/postgresql/data" \
        -p 5432:5432 \
        postgres:14
    ```
