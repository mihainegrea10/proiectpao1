## Aplicație Bancară
Aceasta platforma contine generalele actiuni disponibile la o banca, oferind optiunea de a-ti crea un cont la acea banca. Dupa crearea unui cont, clientul are optiunea de a-si poate face atat card cat si un cont de economii. De asemenea se pot crea si tranzactii. Pentru informatii complete clientul isi poate efectua si un extras de cont.


### Actiuni / Interogari:
 - Creare client (create_customer)
 - Creare card (create_customer_card)
 - Afisare date client (get_customer)
 - Extras de cont total client (get_customer_amount)
 - Afisare conturi client (get_customer_accounts)
 - Afisare cont client (get_customer_account)
 - Incarcare cont client (load_customer_account)
 - Creare tranzactie (create_transaction)
 - Creare cont bancar (create_customer_account)
 - Creare cont economii (create_customer_savings_account)
 - Inchidere cont bancar (close_customer_account)
 - Afisare istoric tranzactii (get_customer_transactions)

### Obiecte:
 - Account (+ AccountCreator)
   - SavingsAccount
 - Card (+ CardCreator)
   - Visa
   - MasterCard
 - Transaction
 - Customer (+ CustomerCreator)
   - Address
 - MainService
 - Main


