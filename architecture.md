## Покер ##
------------
### Смысл приложения ###
-----------------
На вход подается набор из пяти карт, программа должна выдавать ответ: какую старшую комбинацию можно составить из этих карт.

Комбинации:
![Комбинации](http://www.casinoreviewbank.com/dictionary_images/Poker_Hand.jpg "Комбинации")

### Функции ###
Каждая карта задается своей мастью и названием на английском языке. См: http://engblog.ru/about-playing-cards-in-english

Пример: Diamonds Ace, Hearts Jack   и так далее

Заносим их в массив, кодируя достоинства карт цифрами: от двух до 14 (туз).

Каждая комбинация - это функция, на вход которой будет подаваться массив карт.
Сначала подаем массив карт на вход функции Флеш рояль, т.к. эта комбинация самая сильная. Если карты удовлетворяют условиям, то возвращается ответ, иначе карты подаются на вход функции с комбинацией слабее, то есть Стрит флеш. И так далее. 

### Сущности ###

Объект Card

Масть (suit)

Достоинство (kind)

Функции: RoyalFlush, StraightFlush, FourOfAKind, FullHouse, Flush, Straight, ThreeOfAKind, TwoPairs, OnePair.

