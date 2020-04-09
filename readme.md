# PlayFrameworkのデプロイ

アーカイブの作成
```
$ sbt dist
```

アプリケーションの実行
```
$ sbt playGenerateSecret
 Generated new secret: <key>
$ unzip target/universal/<project>-<version>-SNAPSHOT.zip
$ chmod a+x target/universal/<project>-<version>-SNAPSHOT/bin/hello-play
$ target/universal/<project>-<version>-SNAPSHOT/bin/<project> -Dplay.http.secret.key=<key>
```