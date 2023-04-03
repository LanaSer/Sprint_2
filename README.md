## qa_java
1. В когде должны быть:
- Класс Food — абстрактный класс с полями:
- amount — количество продукта в килограммах (целое число);
- price — цена за единицу (вещественное число);
- isVegetarian — флаг, который показывает, вегетарианский ли продукт.
Поля должны быть доступны только из классов-потомков.
2. нтерфейс Discountable c единственным методом getDiscount. Он возвращает размер скидки — вещественное число.
Все классы, реализующие этот интерфейс, возвращают значение 0 в методе getDiscount, если в задании не указано иное.
3. Наследники класса Food: Meat и Apple
* Класс Meat — для мяса. Это класс с конструктором. Конструктор принимает два входных параметра — количество и цену. И устанавливает для флага isVegetarian правильное значение. 
* Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок. Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
* Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
# Пакеты и подпакеты
Создай иерархию пакетов.
Подпакет constants. Заведи подпакет constants в пакете model. Там создай два класса: 
Discount для значений скидок,
Colour для цветов red и green — это цвета яблок. В них все поля должны быть public static final.
Пакет service. В нём создай класс для корзины — ShoppingCart. Добавь в него поле — массив элементов из объектов типа Food. Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины. 
В классе ShoppingCart реализуй методы для работы с корзиной:
получить общую сумму товаров в корзине без скидки,
получить общую сумму товаров в корзине со скидкой,
получить общую сумму всех вегетарианских продуктов в корзине без скидки.
