--Ürün fiyatlarının toplamı ne kadar?
select SUM(products."unitPrice") as ürün_toplam_fiyatı 
from products

--Stok adedi 100' den fazla olan ürünleri getir ve isme göre sırala?
select * from products 
where stock > 100 
order by name desc

--En pahalı ürünün fiyatı?
select max(products."unitPrice") as en_yüksek_fiyatlı_ürün 
from products

---Hangi kategoride kaç ürün vardır?
select ca.name, count(pr.id) as adet from products pr
inner join product_categories pc
on pr.id = pc.product_id
inner join categories ca
on ca.id=pc.category_id
group by ca.name
order by adet desc

--Adres başlığı 'Home' olan hangi ülkelere satış yapılmıştır?
select co.name from countries co
inner join addresses addr on co.id = addr.country_id
where addr.title = 'Home'


-- Ankara'dan sipariş veren müşterilerin müşteri numarası?
select ci.name, cu.customer_no from cities ci
inner join addresses addr on ci.id = addr.id
inner join customers cu on addr.id = cu.id
inner join orders o on cu.id = o.id
where ci.name = 'Ankara' 
order by cu.customer_no


-- Clothes Kategorisinde S İle Başlayan ürünler?
select pr.name from products pr
inner join product_categories pc
on pr.id = pc.product_id
inner join categories ca
on ca.id=pc.category_id
where ca.name = 'Clothes' AND pr.name LIKE 'S%'


--Mouse ürününü hangi tedarikçi sağlar?
select pr.name, s.name from products pr
inner join supplier_details sd on pr.id = sd.product_id
inner join suppliers s on sd.id = s.supplier_detail_id
where pr.name = 'Mouse'
order by s.name

--Ödeme tipi Kredi olan ürünlerin listesi?
select pr.name, pt.name from payment_types pt
inner join payments py on pt.id = py.payment_type_id
inner join orders o on py.id = o.payment_id
inner join order_details od on o.id = od.order_id
inner join products pr on od.id = pr.id
where pt.name = 'Credit'
order by pr.name

--Hangi siparişin ödemesi ne zaman alındı?
select py.payment_date, o.id from orders o 
inner join payments py on o.id = py.id
order by o.id
