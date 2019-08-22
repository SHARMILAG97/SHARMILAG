# Online Book Shop

##Tables

#### Table 1: Books
| Sno | Name | Price | Ratings |
| -- | -- | -- | -- | 
| 1 | Java | 700 | 4 | 
| 2 | C | 500 | 5 |
| 3 | C++ | 800 | 2 |
| 4 | Python | 1000 | 3 |
| 5 | Sql | 300 | 5 |

#### List All Books

`
select * from Books where Price between 300 and 700 order by Price desc
`
