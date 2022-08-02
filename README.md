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


# Cara Setup Database #

1. Jalankan postgreSql di docker
    
    `docker run --rm \
        --name invoice-db \
        -e POSTGRES_DB=invoicedb \
        -e POSTGRES_USER=invoice \
        -e POSTGRES_PASSWORD=PViwM7w7Tq5cL2N1cHLo \
        -e PGDATA=/var/lib/postgresql/data/pgdata \
        -v ./invoicedb-data:/var/lib/postgresql/data \
        postgres:14`
