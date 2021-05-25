1. create db install mysql
2. create Pj get by github.
3. create Database
   create database swagger_test;
```exp

create folder DevDataBase
   create init <-> docker postgres init
   use to docker file server

```   

4. create tables.
``` exp
    create Object User
    generate User table
    
    mysql 과는 다르게 postgres는 obj를 생성하는 방식이 살짝 다르다.
    현재 완전 자동 변경은 불가능 한것으로 보인다.
    
    일단 @Entity 어노테이션으로 테이블을 추가 작성후 @Builder
    
```
 




```

@NoArgsConstructor
引数なしのコンストラクタを自動で作成する。
JPAのEntityのライフサイクル上、引数なしのコンストラクタが必要。
引数なしのコンストラクタが存在するような構成ならば不要。(finalなフィールドが無い場合など。@Builder使うなら絶対必要)

@AllArgsConstructor
すべてのフィールドを引数に取るコンストラクタを作成する。
NoArgsConstructorを指定した場合、こちらも指定しないと、
@Builderが動かない(@Builderではすべてのフィールドを引数にとるコンストラクタを自動で生成するが、xxxArgsConstructorがついてるクラスに対しては、コンストラクタを作成しない。そして動かない。)

```
