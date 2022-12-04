### JPQL (Java Persistence Query Language)
```sh
JPA Query Language JPA Api'leri kullanılarak sorgu cümleleri oluşturmaya yarayan bir yapıdır. 
EntityManager arayüzünün createQuery ve createNamedQuery isimli 2 metodu ile sorgu cümlesi oluşturalabilir. 
JPQL syntax'ı klasik SQL syntax'ına benzemekle beraber özgün farklılıklar da içermektedir. 
Örneğin bir select cümlesinde from sözcüğünden sonra tablo ismi yerine JPQL içerisinde varlık(entity) ismi koyulmalıdır. 
Jpql sorguları JPA Api'lerinin kullanılarak implemente edilmiş tüm ortamlar için gerçerlidir.
``` 

### JPA QUERY METHODS
#### Query Methods using And Keyword :
```sh
public List<Student> findByNameAndRollNumber(String name, String rollNumber);
``` 
#### Query method using Or Keyword :
```sh
public List<Student> findByNameOrRollNumber(String name, String rollNumber);
``` 
#### Query method using And and Or Keyword together :
```sh
public List<Student> findByNameAndRollNumberOrUniversity(String name, String rollNumber, String university);
``` 
#### Query method using Between Keyword :
```sh
public List<Student> findByRollNumberBetween(String start, String end);
```
#### Query method using LessThan Keyword :
```sh
public List<Student> findByRollNumberLessThan(String rollnumber);
```
#### Query method using LessThanEqual Keyword :
```sh
public List<Student> findByRollNumberLessThanEqual(String rollnumber);
```
#### Query method using GreaterThan Keyword :
```sh
public List<Student> findByRollNumberGreaterThan(String rollnumber);
```
#### Query method using GreaterThanEqual Keyword :
```sh
public List<Student> findByRollNumberGreaterThanEqual(String rollnumber);
```
#### Query method using IsNull Keyword :
```sh
public List<Student> findByNameIsNull();
```
#### Query method using IsNotNull Keyword :
```sh
public List<Student> findByNameOrNameIsNull(String name);
```
#### Query method using Like Keyword :
```sh
public List<Student> findByNameLike(String name);
```
#### Query method using OrderBy Keyword :
```sh
List<Student> findAllByOrderByNameAsc();
```
#### Query method using In Keyword :
```sh
public List<Student> findByRollNumberIn(List<String> rollNumbers);
```

### DTO (Data Transfer Object)
```sh
DTO, Data Transfer Object (Veri Transfer Nesnesi) anlamına gelir ve genellikle veri taşıma işlemlerinde kullanılır. 
Bir DTO temel olarak verileri süreçler arasında (bir uygulamanın bir sisteminden diğerine) gönderebilmek için 
encapsula eden bir nesnedir. 
Bu tür nesne en yaygın olarak N katmanlı bir uygulamada Service katmanı tarafından kullanılır ve kendi katmanı 
ile diğer denetleyici katmanı arasında veri aktarır.
DTO'lar normalde POJO'lar olarak oluşturulur. Hiçbir iş mantığı içermeyen düz veri yapılarıdır. 
Yalnızca depolama, erişimciler ve nihayetinde serileştirme veya ayrıştırma ile ilgili yöntemleri içerirler.
Veriler, domain modellerinden DTO'lara, normalde sunum veya cephe katmanındaki bir mapper aracılığıyla mapplenir.
``` 

