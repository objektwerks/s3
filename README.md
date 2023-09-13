S3
--
>S3 features test using the Minio, AWS SDK and Scala 3.

Install
-------
>Install Minio ( https://docs.min.io ).
1. brew install minio/stable/minio
2. export MINIO_ACCESS_KEY="Ieteen7g"
3. export MINIO_SECRET_KEY="Oep0poh3"
>The above keys were generatd via pwgen ( brew install pwgen ); and added to .zprofile

Start
-----
>Make note of the process id.
>For instance:
1. nohup minio server ~/.minios3 > ~/.minios3/server.out &
```
[1] 35299
```

Browser
-------
1. Open browser to http://127.0.0.1:9000
2. Login with MINIO_ACCESS_KEY and MINIO_SECRET_KEY values.

Test
----
1. sbt clean test

Stop
----
>Kill the minio server process via its process id.
>For instance:
1. kill 35299
```
[1]  + 35299 done       nohup minio server ~/.minios3 > ~/.minios3/server.out
```