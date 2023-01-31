# [Prime-numbers-API ](https://prime-numbers-api.com)

Welcome to Prime Numbers API (https://prime-numbers-api.com), the largest commercial database of prime numbers in the world! 

Here we have more than __8.1 billion__ curated primes from the first __200 billion composite numbers__, and counting!


### [Overview](https://prime-numbers-api.com/index.php?route=journal3/blog)
Whether you're a scientist, security expert, or you simply love math, Prime Numbers has something to offer you!

In the last 5 years, we've invested over 3 000 human-hours, over 100 000 computer-hours, with an average processing speed of 400 million composite numbers per day while using 100% green energy. We've taken the leg work out of finding primes, so you can focus on using them. 

We've also translated the output into 8 of the most commonly used languages, including __Mandarin__, __Hindi__, __Spanish__, __French__, __German__, __Italian__, __Japanese__, and __Russian__, making the Prime Numbers the most accessible API for finding prime numbers in the world!
#### Try it for Free: http://try.prime-numbers.io/

If you’re looking for help with encryption, gain access to our __exclusive isolated primes endpoint__ and you can filter for rare primes that lie at least 200, and even up to 500+ numbers away from their closest neighbors! The average probability of finding one of the isolated prime numbers by accident is 1 in over 800,000 (or 0.000124565509%)! The chances of being struck by lightning are 1 in 500,000! Now that’s a strong password!

Our API conveniently translates the language of your smart devices. Every number is returned with its respective translation into binary, senary, and hexa values.

Furthermore, each prime number you receive from the API is home-grown, curated, and 100% genuine; and it even comes with its very own __birth certificate__! No copies, clones, or placeholders here! 

The API results have a multitude of configurations. These range from simple and fast to incredibly verbose, with extensive explanations for each field. Whether you're looking for efficient server-to-server communication or you're in need of prime numbers for educational or research purposes, the results can be custom-tailored to suit your needs!

With these prime types outputs, you can determine:
* __Isolated__: rare prime numbers with an average density of 0.000124565509% that are 200 to 500+ composite numbers away from each of their neighbours
* __Palindromes__: primes which reads the same backwards as forwards (examples: 101, 373, 919)
* __Twins__: primes that are no more than 2 composite numbers from each other (examples: (5, 7), (11, 13), (17, 19))
* __Cousins__: primes that are no more than 4 composite numbers from each other (examples: (7, 11), (37, 41), (43, 47))
* __Sexys__: primes that are no more than 6 composite numbers from each other (examples: (7,13), (13,19), (23,29))
* __Reversibles__: primes that become a different prime when their decimal digits are reversed (examples: 37, 107, 149)
* __Pandigitals__: primes in a base has at least one instance of each base digit (examples: 2143 (base 4), 7654321 (base 7))
* __Repunits__: primes are positive integers in which every digit is one (examples: 11, 1111111111111111111)
* __Mersenne__: primes that is of the form 2n - 1 (one less than a power of two) for some integer n (examples: 3 (2^2 - 1), 7 (2^3 - 1), 31 (2^5 - 1) )
* __Fibonacci__: primes that are also Fibonacci numbers (examples: 89, 233, 1597)
* __Prime type densities__: how many prime type numbers in percentage can be found in every million composite numbers
* ...and so much more!
 

Whether you're just looking for efficient server-to-server communication, or you're in need of prime numbers for educational or research purposes, the results can be custom tailored to suit your needs!


## [API Price Plans](https://prime-numbers-api.com) (https://prime-numbers-api.com)
| API Plan Name                       | Free                      | Maths is Fun              | Scientist                 | Expert                    |
|-------------------------------------|---------------------------|---------------------------|---------------------------|---------------------------|
| Price / month                       |  0.00                    |  £7.99 (approx. $12 or €11)                    |  £19.99 (approx. $31 or €28)                   |  £29.99 (approx. $47 or €43)                   |
| Summary                             | Ideal for Maths Enthusiasts or for an opportunity to test drive the system for free | Ideal for Maths Enthusiasts and Educators alike.  | Ideal for Big Data, Machine Learning, Artificial Intelligence, Robotics and Internet of Things Scientists as well as for Web and App Developers. | Ideal for System Administrators and Security Experts. |
| FREE API Key refresh                       |  Automatically, 1st of every month 	                   |  When you need it                    |  When you need it                   |  When you need it  
| Max calls limits                    |                           |                           |                           |                           |
| Maximum calls per day               |  100                      |  1 000                    |  3 000                    |  5 000                    |
| Maximum calls per second            |  1                        |  3                        |  5                        |  10                       |
| API Endpoints Available             |                           |                           |                           |                           |
| get-random-prime                    |  included                 |  included                 |  included                 |  included                 |
| is-this-number-prime                |  included                 |  included                 |  included                 |  included                 |
| prospect-primes-between-two-numbers |  x                        |  included                 |  included                 |  included                 |
| get-all-primes-between-two-numbers  |  x                        |  x                        |  included                 |  included                 |
| get-isolated-random-prime           |  x                        |  x                        |  x                        |  included                 |
| Support availability                |                           |                           |                           |                           |
| Help Centre                               |  included                 |  included                 |  included                 |  included                 |
| Support Tickets                            |  x                        |  included                 |  included                 |  included                 |


### [Authentication](https://prime-numbers-api.com/index.php?route=journal3/blog)
Authenticate using the API key with extra security provided by the domain name and IP address locks (the API requests are only accepted from your IP or domain name)




### [Status Codes](https://prime-numbers-api.com/index.php?route=journal3/blog)
* 200 OK
* 403 user not found
* 404 no results found




### [Rate limits](https://prime-numbers-api.com/index.php?route=journal3/blog)
* Maximum calls per second: 1
* Maximum calls per day: 100




### [Output Format](https://prime-numbers-api.com/index.php?route=journal3/blog)
* JSON

___


### Example API response
* Get Random Prime API endpoint in English:
```json
{
    "random_prime_number_value": 121732227053,
    "base_conversions": {
        "binary_value": "1110001010111110011100101111111101101",
        "binary_value_explanation": "prime number base-2 (binary value), useful for cryptography and cryptocurrency",
        "senary_value": "131531212033125",
        "senary_value_explanation": "prime number base-6 (senary value), useful for mathematical research",
        "hexa_value": "1c57ce5fed",
        "hexa_value_explanation": "prime number base-16 (hexa value), useful for cryptography and cryptocurrency"
    },
    "previous_prime_gap": 4,
    "previous_prime_gap_explanation": "how many successive prime and composite numbers are between this prime and the previous one",
    "prime_density": "3.92090000",
    "prime_density_explanation": "how many prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
    "isolated_primes": {
        "is_isolated_prime": "false",
        "is_isolated_prime_explanation": "prime numbers that are more than 100 composite numbers away from each of their neighbours, with an average density of %",
        "isolated_prime_density": "unknown",
        "isolated_prime_density_explanation": "how many chances (%) to randomly find an isolated prime number in this million composite numbers (between 121 732 000 000 and 121 733 000 000)"
    },
    "prime_types": {
        "is_palindrome": "false",
        "palindrome_explanation": "number that is simultaneously palindromic (which reads the same backwards as forwards) and prime (examples: 2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919, 929) (reference: https://en.wikipedia.org/wiki/Palindromic_prime)",
        "palindrome_percentage": "0.00000000",
        "palindrome_density_explanation": "how many palindrome prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_twin": "false",
        "twin_explanation": "primes that are no more than 2 composite numbers from each other (examples: (3, 5), (5, 7), (11, 13), (17, 19)) (reference: https://en.wikipedia.org/wiki/Twin_prime)",
        "twin_percentage": "0.40500000",
        "twin_density_explanation": "how many twin prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_cousin": "true",
        "cousin_value": 121732227049,
        "cousin_explanation": "primes that are no more than 4 composite numbers from each other (examples: (3, 7), (7, 11), (13, 17), (19, 23), (37, 41), (43, 47)) (reference: https://en.wikipedia.org/wiki/Cousin_prime)",
        "cousin_percentage": "0.40380000",
        "cousin_density_explanation": "how many cousin prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_sexy": "true",
        "sexy_value": 121732227059,
        "sexy_explanation": "primes that are no more than 6 composite numbers from each other (examples: (5,11), (7,13), (11,17), (13,19), (17,23), (23,29)) (reference: https://en.wikipedia.org/wiki/Sexy_prime)",
        "sexy_percentage": "0.71050000",
        "sexy_density_explanation": "how many sexy prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_reversible": "false",
        "reversible_explanation": "primes that become a different prime when their decimal digits are reversed. The name emirp is obtained by reversing the word prime (examples: 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157) (reference: https://en.wikipedia.org/wiki/Emirp)",
        "reversible_percentage": "0.61090000",
        "reversible_density_explanation": "how many reversible prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_pandigital": "false",
        "pandigital_explanation": "pandigital prime in a base has at least one instance of each base digit. (examples: 2143 (base 4), 7654321 (base 7)) (reference: https://www.xarg.org/puzzle/project-euler/problem-41/)",
        "pandigital_percentage": "0.00000000",
        "pandigital_density_explanation": "how many pandigital prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_repunit": "false",
        "repunit_explanation": "repunits primes are positive integers in which every digit is one (examples: 11, 1111111111111111111) (reference: https://primes.utm.edu/glossary/page.php?sort=Repunit)",
        "repunit_percentage": "0.00000000",
        "repunit_density_explanation": "how many repunit prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_mersenne": "false",
        "mersenne_explanation": "mersenne prime is a prime number that is of the form 2^n - 1 (one less than a power of two) for some integer n. They are named after Marin Mersenne (1588-1648), a French monk who studied them in his Cogitata Physica-Mathematica (1644) (examples: 3 (2^2 - 1), 7 (2^3 - 1), 31 (2^5 - 1) ) (reference: https://www.mersenne.org/)",
        "mersenne_percentage": "0.00000000",
        "mersenne_density_explanation": "how many mersenne prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)",
        "is_fibonacci": "false",
        "fibonacci_explanation": "prime numbers that are also Fibonacci numbers (examples: 2, 3, 5, 13, 89, 233, 1597) (reference: https://oeis.org/A005478)",
        "fibonacci_percentage": "0.00000000",
        "fibonacci_density_explanation": "how many fibonacci prime numbers (%) can be found in this million composite numbers (between 121 732 000 000 and 121 733 000 000)"
    },
    "prime_senses": {
        "color": "#23c48b (greenblue)",
        "sound": "E5 (equal tuning frequency at 440 Hz: 659.26Hz MIDI note number: 76)",
        "smell": "cinnamon",
        "taste": "moss",
        "touch": "lacquered wood floor",
        "feeling": "absorbed",
        "senses_explanation": "explore the random positioning of primes among their neighboring composite numbers with all your senses as each composite number sequentially matches the corresponding sense variations; our library includes: 900+ colors (shades), 100+ sounds (MIDI notes), 800+ tastes (savors), 100+ smells (scents), 100+ types of tactile sense (touch), and 350+ feelings (emotions); multi-sensorial pattern recognition is useful for education and research"
    },
    "birth_certificate": "2021-09-05 20:06:56: server walle processed 348 901 computations in 5.8150242918428 micro-seconds using 2 x 3 GHz Deca-Core Intel Xeon CPUs",
    "birth_certificate_explanation": "how many computations, how much time and what computer power was used to find this prime number"
}
```

___


### [Usefull Links](https://prime-numbers-api.com/index.php?route=journal3/blog)

* Try it for Free: http://try.prime-numbers.io/
* Full documentation: https://prime-numbers-api.com/index.php?route=journal3/blog
* Swagger OpenAPI: https://swagger.prime-numbers-api.com/
* Download Swagger YML file: https://swagger.prime-numbers-api.com/prime-numbers.io_open_api_collection.yml
* Download Postman Collection: http://prime-numbers-api.com/downloads/prime-numbers-api.postman_collection.json
* Download Postman Environment: http://prime-numbers-api.com/downloads/prime-numbers.io.postman_environment.json
* Frequently Asked Questions: https://prime-numbers-api.com/index.php?route=information/information&information_id=7
* Help Centre: http://help.prime-numbers-api.com/
* Service Status: https://prime-numbers-api.site24x7signals.eu/
___

### [Prime Senses](https://sense.prime-numbers-api.com/) (https://sense.prime-numbers-api.com)
Explore the world of Prime Numbers with all your senses!
> Multi-sensorial pattern recognition is useful for education and research as each composite number sequentially matches the corresponding sense variations. 

Our Library Includes:
* 900+ colors (shades)
* 100+ sounds (MIDI notes)
* 800+ tastes (savors)
* 100+ smells (scents)
* 100+ types of tactile sense (touch)
* 350+ feelings (emotions)

___

### Other Prime-numbers-API code examples
* jQuery: https://github.com/Prime-Numbers-API/jquery-example
* JavaScript Fetch: https://github.com/Prime-Numbers-API/javascript-fetch-example
* React: https://github.com/Prime-Numbers-API/react-example
* NodeJS: https://github.com/Prime-Numbers-API/node-example
* Python: https://github.com/Prime-Numbers-API/python-example
* PHP: https://github.com/Prime-Numbers-API/php-example
* WordPress Plugin: https://github.com/Prime-Numbers-API/wordpress-plugin-example
* Java: https://github.com/Prime-Numbers-API/java-example
* C: https://github.com/Prime-Numbers-API/c-example

