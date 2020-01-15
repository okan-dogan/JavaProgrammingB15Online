package day30;
/*put all toyota cars in new array called toyotaInvetory
Hint : first count toyota to find out your new array size then fill it up with toyota cars
*/

import java.util.Arrays;

public class Task_ToyotaInventory {

    public static void main(String[] args) {
        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                "Lexus-SC",
                "Volvo-S70",
                "Infiniti-QX",
                "Oldsmobile-Silhouette",
                "Aston Martin-Rapide",
                "Honda-S2000",
                "Isuzu-i-Series",
                "Acura-MDX",
                "Infiniti-QX",
                "Ford-Edge",
                "Jeep-Compass",
                "BMW-M6",
                "Mazda-929",
                "Pontiac-Grand Am",
                "Chevrolet-3500",
                "Infiniti-Q",
                "Ford-GT",
                "GMC-Savana 3500",
                "Mercedes-Benz-S-Class",
                "Volkswagen-Passat",
                "Volvo-XC60",
                "Saturn-Ion",
                "Spyker-C8",
                "Acura-ZDX",
                "Jeep-Patriot",
                "Honda-Civic",
                "Chevrolet-Colorado",
                "Kia-Sportage",
                "Ford-Transit Connect",
                "Pontiac-Grand Prix",
                "Pontiac-LeMans",
                "Buick-LeSabre",
                "Toyota-Tundra",
                "Nissan-Rogue",
                "Volkswagen-Golf",
                "Subaru-Impreza",
                "Jaguar-XK Series",
                "BMW-8 Series",
                "Mercedes-Benz-S-Class",
                "Chevrolet-Equinox",
                "Honda-Pilot",
                "Acura-MDX",
                "Pontiac-6000",
                "Mitsubishi-Galant",
                "Chevrolet-Corsica",
                "Ford-F-Series",
                "Pontiac-Sunbird",
                "Chevrolet-Silverado",
                "Volkswagen-GTI",
                "Honda-FCX Clarity",
                "Cadillac-Escalade",
                "Audi-riolet",
                "Pontiac-Montana",
                "Mitsubishi-Galant",
                "Mitsubishi-Precis",
                "Porsche-Cayman",
                "Buick-Rendezvous",
                "Dodge-Viper",
                "Chevrolet-Express 1500",
                "Chevrolet-Blazer",
                "Scion-xB",
                "Mazda-Tribute",
                "Oldsmobile-Silhouette",
                "Bentley-Continental Flying Spur",
                "Volkswagen-Passat",
                "Chevrolet-S10",
                "Suzuki-SJ",
                "Ferrari-FF",
                "Jaguar-S-Type",
                "Lexus-LS",
                "Volkswagen-GTI",
                "Toyota-Tacoma",
                "Chevrolet-Traverse",
                "Lincoln-Aviator",
                "Chrysler-300",
                "Kia-Forte",
                "Mazda-B-Series Plus",
                "Mazda-Mazda3",
                "Volkswagen-CC",
                "Audi-Quattro",
                "Honda-Civic",
                "Suzuki-Aerio",
                "Chevrolet-Impala SS",
                "Toyota-Land Cruiser",
                "Chevrolet-Avalanche",
                "Toyota-Tacoma Xtra",
                "Nissan-Altima",
                "Ford-Thunderbird",
                "Mazda-Tribute",
                "Ford-Econoline E250",
                "Lexus-LS",
                "GMC-Sonoma",
                "GMC-2500",
                "Lexus-RX",
                "Jaguar-XK Series",
                "Chevrolet-Venture",
                "Jeep-Wrangler",
                "Maybach-57",
                "GMC-Savana 1500",
                "Kia-Sorento",
                "Daewoo-Leganza",
                "Plymouth-Neon",
                "Chevrolet-Express 2500",
                "Mercedes-Benz-GL-Class",
                "BMW-M3",
                "Dodge-D150",
                "Audi-S4",
                "Ford-Escort",
                "Chrysler-LHS",
                "Pontiac-Firefly",
                "Toyota-Camry",
                "Ford-Explorer Sport Trac",
                "Kia-Rio",
                "GMC-Sierra 3500",
                "BMW-600",
                "GMC-Canyon",
                "Toyota-4Runner",
                "GMC-Sierra 2500",
                "Chrysler-300M",
                "GMC-Sierra",
                "Bentley-Continental GTC",
                "Pontiac-Firebird",
                "Kia-Sedona",
                "Ford-E150",
                "Chevrolet-Suburban 1500",
                "Spyker-C8 Laviolette",
                "Cadillac-XLR",
                "Cadillac-SRX",
                "Chevrolet-Sportvan G20",
                "Geo-Tracker",
                "Dodge-Ram Van 3500",
                "Chevrolet-HHR",
                "Lexus-GS",
                "GMC-Safari",
                "Plymouth-Laser",
                "Nissan-Leaf",
                "Jeep-Grand Cherokee",
                "Nissan-Pathfinder",
                "Suzuki-Daewoo Lacetti",
                "Toyota-Paseo",
                "Isuzu-i-280",
                "Mazda-MX-6",
                "GMC-Jimmy",
                "BMW-760",
                "Lotus-Esprit",
                "Suzuki-Grand Vitara",
                "Buick-Riviera",
                "Volkswagen-rio",
                "Hyundai-Sonata",
                "Lexus-HS",
                "Mercury-Grand Marquis",
                "Mitsubishi-Galant",
                "Ford-Ranger",
                "Dodge-Stratus",
                "Mazda-MX-5",
                "Maserati-GranTurismo",
                "Ford-Ranger",
                "Acura-TL",
                "Chevrolet-Suburban",
                "Lexus-RX",
                "Mitsubishi-Mirage",
                "Ford-LTD",
                "Mercedes-Benz-M-Class",
                "Jeep-Patriot",
                "Citro√´n-CX",
                "Hyundai-Tucson",
                "Pontiac-Grand Am",
                "Ford-Club Wagon",
                "Chevrolet-TrailBlazer",
                "Chevrolet-Corsica",
                "Chevrolet-Camaro",
                "Chrysler-Cirrus",
                "Ford-Crown Victoria",
                "Chevrolet-Camaro",
                "Mercury-Sable",
                "Pontiac-Grand Prix",
                "Geo-Prizm",
                "Honda-S2000",
                "Lincoln-Continental",
                "Ford-F150",
                "BMW-5 Series",
                "MINI-Cooper",
                "Lotus-Esprit",
                "Subaru-XT",
                "Ford-Thunderbird",
                "Cadillac-Escalade ESV",
                "Cadillac-Escalade EXT",
                "Mercedes-Benz-SLK-Class",
                "Dodge-Avenger",
                "BMW-X6",
                "Lamborghini-Countach",
                "Mitsubishi-Expo LRV",
                "Lexus-LS",
                "Hyundai-Elantra",
                "Infiniti-QX56",
                "Volkswagen-Type 2",
                "BMW-525",
                "GMC-Sierra 1500",
                "Toyota-TundraMax",
                "Audi-A6",
                "Pontiac-Sunbird",
                "Mercedes-Benz-300SE",
                "Mazda-MX-5",
                "Chrysler-Cirrus",
                "Chevrolet-Express 3500",
                "Honda-Crosstour",
                "Volkswagen-Type 2",
                "Suzuki-Grand Vitara",
                "Mercedes-Benz-SL-Class",
                "Volvo-XC90",
                "BMW-7 Series",
                "Toyota-Solara",
                "GMC-Savana 2500",
                "Chevrolet-HHR",
                "Chevrolet-Impala SS",
                "Chevrolet-Equinox",
                "Toyota-Sienna",
                "Ford-E350",
                "Lotus-Esprit",
                "Dodge-Avenger",
                "Oldsmobile-Silhouette",
                "Volvo-C70",
                "Lamborghini-Gallardo",
                "Audi-100",
                "BMW-M Roadster",
                "Porsche-Boxster",
                "Land Rover-Freelander",
                "Chrysler-Concorde",
                "Toyota-Tacoma",
                "Lamborghini-Diablo",
                "Chevrolet-Express 3500",
                "GMC-Acadia",
                "Cadillac-Escalade ESV",
                "Audi-A4",
                "Infiniti-QX",
                "Subaru-Loyale",
                "Bentley-Continental GTC",
                "Volkswagen-New Beetle",
                "Pontiac-Grand Am",
                "Pontiac-Fiero",
                "BMW-325",
                "Jeep-Grand Cherokee",
                "Ford-Thunderbird",
                "Mazda-929",
                "Subaru-XT",
                "Dodge-Ram Wagon B250",
                "GMC-Safari",
                "Ford-Explorer",
                "Honda-Accord",
                "Hummer-H2",
                "Chevrolet-Corvette",
                "Mitsubishi-L300",
                "Mercedes-Benz-CL-Class",
                "GMC-Vandura G1500",
                "Kia-Sedona",
                "Chevrolet-Silverado 1500",
                "Mazda-RX-7",
                "Maserati-Karif",
                "Nissan-Maxima",
                "Nissan-350Z",
                "Honda-S2000",
                "Oldsmobile-Ciera",
                "Ford-Econoline E250",
                "Porsche-968",
                "Volkswagen-GTI",
                "Chevrolet-Suburban 1500",
                "Pontiac-1000",
                "Mercedes-Benz-G-Class",
                "Acura-TL",
                "Toyota-Camry",
                "Mercedes-Benz-G-Class",
                "Ferrari-F430",
                "Bentley-Continental",
                "Oldsmobile-Silhouette",
                "Suzuki-Swift",
                "Jaguar-XJ Series",
                "Chevrolet-Sportvan G20",
                "Mitsubishi-Pajero",
                "Nissan-Altima",
                "Chevrolet-Tahoe",
                "Mitsubishi-Mirage",
                "GMC-Acadia",
                "Audi-4000s",
                "Chevrolet-Corvair",
                "GMC-Sonoma Club Coupe",
                "Mazda-Miata MX-5",
                "Honda-Prelude",
                "Lamborghini-Gallardo",
                "Kia-Soul",
                "Chevrolet-Impala",
                "Dodge-Avenger",
                "Ford-Excursion",
                "GMC-Vandura 2500",
                "Mazda-MX-5",
                "Infiniti-JX",
                "Toyota-Prius",
                "Suzuki-Sidekick",
                "Chrysler-Town & Country",
                "Chrysler-Town & Country",
                "GMC-Sierra",
                "Ford-Ranger",
                "Chevrolet-G-Series 3500",
                "Maybach-Landaulet",
                "Chevrolet-Caprice",
                "Ford-F250",
                "Volvo-S40",
                "Acura-NSX",
                "Aston Martin-V8 Vantage",
                "Saab-9000",
                "Volvo-V90",
                "Mercury-Villager",
                "Volkswagen-Passat",
                "Acura-NSX",
                "Volvo-XC90",
                "Hyundai-Azera",
                "Chevrolet-G-Series 2500",
                "Land Rover-Defender 90",
                "Ford-F350",
                "Chevrolet-Suburban 2500",
                "Toyota-FJ Cruiser",
                "Subaru-Impreza",
                "Lotus-Esprit Turbo",
                "Ferrari-458 Italia",
                "Subaru-Tribeca",
                "Suzuki-Samurai",
                "Audi-S4",
                "BMW-M3",
                "Dodge-D250",
                "Volvo-C70",
                "Pontiac-Montana SV6",
                "Dodge-Dakota Club",
                "Mitsubishi-Eclipse",
                "Acura-Integra",
                "GMC-Envoy",
                "Chevrolet-Beretta",
                "Ford-Ranger",
                "Mitsubishi-Galant",
                "Dodge-Avenger",
                "Jaguar-S-Type",
                "Ford-Expedition",
                "Lincoln-Navigator",
                "Mercury-Grand Marquis",
                "Nissan-Frontier",
                "Chrysler-Crossfire Roadster",
                "Porsche-928",
                "Mercedes-Benz-SL-Class",
                "Pontiac-Fiero",
                "GMC-Yukon",
                "Chevrolet-Express 2500",
                "Toyota-4Runner",
                "Mazda-Millenia",
                "Volvo-S40",
                "Nissan-300ZX",
                "Mazda-RX-8",
                "Saturn-Ion",
                "Dodge-Dakota Club",
                "Suzuki-Sidekick",
                "Cadillac-STS",
                "Cadillac-Escalade EXT",
                "Land Rover-Defender 90",
                "Mazda-Familia",
                "Mercedes-Benz-GLK-Class",
                "Audi-5000CS",
                "Ford-E250",
                "Ford-Thunderbird",
                "Buick-Estate",
                "Oldsmobile-88",
                "Mitsubishi-Galant",
                "GMC-Acadia",
                "Mercedes-Benz-S-Class",
                "Mazda-Protege",
                "Volkswagen-Touareg",
                "Buick-Skyhawk",
                "Suzuki-Sidekick",
                "Honda-Civic",
                "Cadillac-STS-V",
                "Acura-Vigor",
                "Suzuki-Sidekick",
                "Mercedes-Benz-W123",
                "GMC-2500",
                "Lexus-IS-F",
                "Chrysler-Sebring",
                "Dodge-Durango",
                "Pontiac-Sunbird",
                "Bentley-Continental GT",
                "Isuzu-Trooper",
                "Acura-MDX",
                "GMC-2500",
                "Nissan-Rogue",
                "Chevrolet-Suburban 1500",
                "Dodge-Viper RT/10",
                "Toyota-Sequoia",
                "Ford-Th!nk",
                "BMW-M6",
                "Chevrolet-Silverado 1500",
                "BMW-600",
                "Pontiac-Grand Am",
                "Porsche-944",
                "Nissan-Titan",
                "Pontiac-G5",
                "Saturn-L-Series",
                "Mitsubishi-Mighty Max",
                "Ford-Mustang",
                "Hummer-H3T",
                "Jaguar-XK",
                "Saab-43711",
                "Ram-1500",
                "Chevrolet-Tahoe",
                "Mitsubishi-Mirage",
                "GMC-1500 Club Coupe",
                "Dodge-Dakota Club",
                "Porsche-911",
                "Mercedes-Benz-CLK-Class",
                "Toyota-4Runner",
                "Honda-Element",
                "Pontiac-Sunbird",
                "Cadillac-XLR-V",
                "Mercedes-Benz-CLK-Class",
                "Land Rover-Range Rover",
                "Ford-Focus",
                "Cadillac-Seville",
                "Subaru-Outback",
                "Jaguar-X-Type",
                "Isuzu-Oasis",
                "Mercury-Mountaineer",
                "Chevrolet-Avalanche 1500",
                "Kia-Forte",
                "Ford-E-Series",
                "Bentley-Continental Flying Spur",
                "Nissan-Frontier",
                "Volkswagen-GTI",
                "Chrysler-LHS",
                "Buick-Riviera",
                "Volvo-V50",
                "GMC-Savana 2500",
                "Maybach-Landaulet",
                "Buick-LaCrosse",
                "Chevrolet-SSR",
                "Bentley-Continental Super",
                "Ford-Mustang",
                "Toyota-Paseo",
                "Audi-5000CS",
                "Toyota-Yaris",
                "Volvo-S40",
                "Nissan-Murano",
                "Toyota-4Runner",
                "Lincoln-Continental",
                "Mercury-Marauder",
                "Volkswagen-Jetta",
                "Honda-Civic",
                "BMW-3 Series",
                "Hyundai-Tucson",
                "Lexus-SC",
                "GMC-Sierra 1500",
                "Toyota-RAV4",
                "GMC-Envoy",
                "Ford-Expedition",
                "Dodge-Ram 3500",
                "Dodge-Ram Van 2500",
                "Lincoln-MKT",
                "BMW-3 Series",
                "Mercury-Montego",
                "Ford-F250",
                "Chevrolet-Sportvan G10",
                "Audi-V8",
                "Ford-Explorer",
                "Volvo-850",
                "Dodge-Stratus",
                "Audi-S8",
                "Toyota-Tacoma Xtra",
                "Chevrolet-S10",
                "Mercedes-Benz-G-Class",
                "Porsche-Cayman",
                "Volkswagen-Passat",
                "BMW-Z4",
                "Toyota-Land Cruiser",
                "Toyota-RAV4",
                "Audi-A4",
                "Buick-Roadmaster",
                "Volkswagen-Passat",
                "Subaru-SVX",
                "Jeep-Wrangler",
                "Infiniti-G37",
                "Chrysler-300",
                "Toyota-Previa",
                "Chevrolet-APV",
                "Ford-Tempo",
                "Eagle-Vision",
                "Hyundai-Elantra",
                "Mercedes-Benz-E-Class",
                "Nissan-Altima",
                "Oldsmobile-Intrigue",
                "Scion-xD",
                "Chevrolet-Avalanche",
                "Mazda-Miata MX-5",
                "Hyundai-Veracruz",
                "Toyota-Celica",
                "Lincoln-Continental",
                "Dodge-Ram 3500",
                "Ford-F350",
                "Panoz-Esperante",
                "Acura-TL",
                "Saturn-Ion",
                "Pontiac-1000",
                "Audi-Cabriolet",
                "Volkswagen-CC",
                "Volvo-C70",
                "Ford-F150",
                "Mercury-Cougar",
                "Hyundai-Sonata",
                "Jaguar-S-Type",
                "Honda-CR-V",
                "Jaguar-S-Type",
                "Pontiac-Montana",
                "GMC-Savana 2500",
                "Acura-RL",
                "Suzuki-SJ",
                "Ford-Bronco",
                "Pontiac-Torrent",
                "Pontiac-Firefly",
                "Mercury-Cougar",
                "Ford-Taurus",
                "Mercury-Grand Marquis",
                "Dodge-Dakota",
                "Mercedes-Benz-GLK-Class",
                "Scion-tC",
                "Acura-TL",
                "Lincoln-LS",
                "Lamborghini-Murci√©lago",
                "Mazda-B-Series",
                "Ford-Ranger",
                "Dodge-Colt",
                "Mazda-MX-5",
                "Toyota-Camry Hybrid",
                "Pontiac-GTO",
                "Chevrolet-Corvette",
                "Saab-43713",
                "Toyota-Venza",
                "GMC-Sierra 1500",
                "Mercedes-Benz-M-Class",
                "Lexus-ES",
                "Jeep-Wrangler",
                "Mercedes-Benz-SL-Class",
                "Suzuki-Daewoo Lacetti",
                "Toyota-Highlander",
                "Lexus-RX",
                "Audi-A6",
                "Maybach-57",
                "GMC-Safari",
                "Toyota-Land Cruiser",
                "Volkswagen-Corrado",
                "Chevrolet-Cavalier",
                "Ford-Econoline E150",
                "Lexus-GX",
                "Pontiac-Grand Prix",
                "Pontiac-Sunbird",
                "Hummer-H1",
                "Honda-Civic",
                "Mazda-626",
                "Nissan-350Z",
                "Ford-Explorer Sport Trac",
                "Dodge-Colt",
                "Honda-Passport",
                "Mercedes-Benz-E-Class",
                "Saab-43713",
                "Pontiac-GTO",
                "Mitsubishi-Cordia",
                "Ford-Ranger",
                "Ford-F-Series",
                "Ford-Econoline E350",
                "Mazda-929",
                "Honda-Element",
                "Dodge-Magnum",
                "Chevrolet-Express 3500",
                "Audi-Cabriolet",
                "Volkswagen-Jetta",
                "Toyota-Solara",
                "Toyota-4Runner",
                "Honda-Passport",
                "Mercedes-Benz-E-Class",
                "Mercedes-Benz-W126",
                "Plymouth-Voyager",
                "Volvo-S60",
                "Toyota-Corolla",
                "Ford-Econoline E250",
                "Ford-Probe",
                "Toyota-Camry",
                "Chevrolet-Corvette",
                "Chevrolet-S10",
                "Buick-LeSabre",
                "Infiniti-QX",
                "Chrysler-Town & Country",
                "Ford-Bronco",
                "Lexus-IS",
                "Volkswagen-Passat",
                "Suzuki-XL7",
                "Lincoln-Continental",
                "Chevrolet-Blazer",
                "Lexus-ES",
                "Audi-90",
                "Honda-Accord",
                "Volvo-960",
                "Dodge-Ram Van B350",
                "Honda-Prelude",
                "Chevrolet-Express 3500",
                "Buick-Roadmaster",
                "Nissan-Frontier",
                "Chevrolet-Express 1500",
                "Chevrolet-Astro",
                "Plymouth-Prowler",
                "Land Rover-Defender 90",
                "Ford-Transit Connect",
                "Volvo-XC90",
                "Jeep-Wrangler",
                "Mercury-Capri",
                "Buick-Regal",
                "Buick-Rainier",
                "Lincoln-MKX",
                "Nissan-Sentra",
                "Ford-Thunderbird",
                "Aston Martin-DBS",
                "Toyota-Land Cruiser",
                "Cadillac-Escalade",
                "Dodge-Ram Van 2500",
                "Buick-Century",
                "Ford-Courier",
                "Lexus-LX",
                "Acura-TSX",
                "Mercedes-Benz-CLS-Class",
                "Lotus-Exige",
                "Mazda-MX-5",
                "Mazda-Mazda6",
                "Dodge-Ram Van 2500",
                "Buick-Skylark",
                "Mitsubishi-L300",
                "Honda-Accord",
                "Ford-Mustang",
                "Lexus-GS",
                "Lexus-GX",
                "GMC-Safari",
                "Studebaker-Avanti",
                "Porsche-Boxster",
                "BMW-530",
                "Volvo-S80",
                "Ford-Mustang",
                "Toyota-4Runner",
                "Chevrolet-Silverado 2500",
                "Chevrolet-Silverado 2500",
                "Jaguar-XJ Series",
                "Dodge-Durango",
                "Volvo-V70",
                "Toyota-T100 Xtra",
                "Plymouth-Breeze",
                "Toyota-Prius",
                "Ford-Mustang",
                "Honda-Civic",
                "Nissan-Rogue",
                "Scion-xB",
                "Chevrolet-Suburban",
                "Lexus-GS",
                "GMC-Envoy",
                "Suzuki-Daewoo Magnus",
                "MINI-Cooper Clubman",
                "Ford-F150",
                "Ford-F450",
                "Ford-E-Series",
                "Mitsubishi-Mirage",
                "Lotus-Elise",
                "Oldsmobile-Silhouette",
                "Toyota-Venza",
                "Volkswagen-Rabbit",
                "Dodge-Ram Van 1500",
                "Ford-E350",
                "Chrysler-LHS",
                "Kia-Spectra",
                "Maserati-Quattroporte",
                "Ram-3500",
                "Toyota-Tacoma",
                "Saab-43711",
                "Dodge-Caravan",
                "Jaguar-XJ Series",
                "Honda-CR-V",
                "Buick-Roadmaster",
                "Nissan-Altima",
                "Chrysler-Pacifica",
                "Aston Martin-V8 Vantage",
                "Porsche-928",
                "Mercury-Tracer",
                "Mitsubishi-Sigma",
                "Lotus-Esprit",
                "Dodge-Durango",
                "Mitsubishi-Mirage",
                "Lincoln-Town Car",
                "Toyota-Yaris",
                "Scion-xB",
                "GMC-Sierra 1500",
                "Ford-Transit Connect",
                "Honda-Accord",
                "Scion-xA",
                "Mercury-Sable",
                "Lincoln-Town Car",
                "MINI-Clubman",
                "Mitsubishi-Outlander",
                "Cadillac-CTS-V",
                "Honda-CR-X",
                "Chevrolet-Malibu",
                "Ford-Mustang",
                "Buick-Electra",
                "GMC-Vandura 1500",
                "Ford-Escort",
                "Chevrolet-Prizm",
                "GMC-Sierra 2500",
                "Smart-Fortwo",
                "BMW-1 Series",
                "Pontiac-Bonneville",
                "Suzuki-Swift",
                "Jeep-Patriot",
                "Mercedes-Benz-W201",
                "Nissan-Armada",
                "Ford-Escort",
                "Ford-Probe",
                "Lamborghini-Diablo",
                "Saab-900",
                "Rolls-Royce-Phantom",
                "Bentley-Mulsanne",
                "Ford-E350",
                "Toyota-Tercel",
                "Volvo-V40",
                "Dodge-Ram 2500",
                "Chevrolet-Silverado 1500",
                "Infiniti-G",
                "Ford-Courier",
                "Chevrolet-Impala",
                "BMW-745",
                "Mercedes-Benz-M-Class",
                "Subaru-B9 Tribeca",
                "Lincoln-Mark VIII",
                "Jeep-Commander",
                "Mitsubishi-Montero",
                "GMC-Suburban 2500",
                "Mitsubishi-Lancer",
                "Dodge-Dakota",
                "Toyota-Yaris",
                "Subaru-Legacy",
                "Mitsubishi-Outlander",
                "Infiniti-M",
                "Volkswagen-Corrado",
                "Mercury-Cougar",
                "Bentley-Continental GT",
                "Chevrolet-Malibu",
                "Buick-LaCrosse",
                "Ford-Mustang",
                "Chevrolet-Silverado 2500",
                "Mercury-Milan",
                "Lincoln-Mark VIII",
                "Kia-Rio",
                "Hyundai-Accent",
                "Dodge-Ram 1500 Club",
                "Ford-Bronco",
                "Chevrolet-Suburban 1500",
                "Dodge-Ram 3500",
                "Audi-RS 6",
                "Ferrari-California",
                "Smart-Fortwo",
                "Dodge-Ram 1500",
                "Volvo-S60",
                "Dodge-Caravan",
                "Pontiac-Tempest",
                "Mercury-Mariner",
                "Mazda-Protege",
                "Hyundai-Santa Fe",
                "Isuzu-Oasis",
                "Porsche-944",
                "Nissan-Pathfinder",
                "Chevrolet-G-Series 1500",
                "Nissan-NV1500",
                "Toyota-T100",
                "Mazda-B-Series",
                "Aston Martin-V12 Vantage",
                "GMC-3500 Club Coupe",
                "Volkswagen-New Beetle",
                "Pontiac-Grand Am",
                "Ram-2500",
                "Pontiac-Fiero",
                "Ford-Mustang",
                "Chevrolet-Uplander",
                "Nissan-Pathfinder",
                "Subaru-Legacy",
                "Chrysler-Concorde",
                "Nissan-Xterra",
                "BMW-3 Series",
                "Chevrolet-Malibu",
                "Jeep-Cherokee",
                "Lincoln-Continental Mark VII",
                "Hyundai-Veracruz",
                "GMC-Yukon XL 1500",
                "Chevrolet-Tahoe",
                "Chevrolet-Impala",
                "Volkswagen-Cabriolet",
                "Jeep-Cherokee",
                "Ford-F250",
                "MINI-Cooper",
                "Volkswagen-New Beetle",
                "BMW-5 Series",
                "Saturn-Outlook",
                "Acura-ZDX",
                "Honda-Prelude",
                "Toyota-Corolla",
                "Mitsubishi-Galant",
                "Ram-C/V",
                "Buick-Skyhawk",
                "Saab-9-7X",
                "Lexus-LS",
                "Honda-del Sol",
                "Volvo-S60",
                "Lotus-Elise",
                "Mazda-B-Series",
                "Suzuki-Samurai",
                "Buick-Electra",
                "Jaguar-XJ Series",
                "Audi-S5",
                "Honda-Element",
                "Mazda-626",
                "GMC-Yukon XL 2500",
                "Audi-S4",
                "Ford-F250",
                "Pontiac-Montana",
                "Scion-xB",
                "Pontiac-Firebird",
                "Chevrolet-Avalanche",
                "Saab-43711",
                "Daewoo-Lanos",
                "GMC-Savana 3500",
                "Mercedes-Benz-SL-Class",
                "Jeep-Grand Cherokee",
                "Infiniti-QX",
                "Buick-Regal",
                "BMW-1 Series",
                "Honda-Accord",
                "Toyota-Celica",
                "Ford-E150",
                "Isuzu-Rodeo",
                "Dodge-Durango",
                "Dodge-Grand Caravan",
                "Acura-Integra",
                "BMW-525",
                "Hyundai-Elantra",
                "Ford-Thunderbird",
                "Nissan-Pathfinder",
                "Chevrolet-Camaro",
                "Cadillac-STS",
                "Volvo-940",
                "Suzuki-Daewoo Magnus",
                "Lexus-LX",
                "Chevrolet-Silverado 2500",
                "Cadillac-Escalade",
                "Pontiac-Grand Am",
                "GMC-Yukon",
                "Lexus-LS Hybrid",
                "Maserati-Quattroporte",
                "BMW-545",
                "GMC-Savana",
                "Lexus-RX Hybrid",
                "Nissan-Pathfinder",
                "Chrysler-300M",
                "Chevrolet-Camaro",
                "Lincoln-MKX",
                "Hyundai-Tiburon",
                "Hyundai-Santa Fe",
                "Lexus-LS",
                "Toyota-Prius",
                "Ford-Lightning",
                "Volvo-S80",
                "Lamborghini-Aventador",
                "Mercury-Sable",
                "Mercedes-Benz-W201",
                "Jaguar-S-Type",
                "GMC-Yukon XL 2500",
                "Mercury-Sable",
                "Mercedes-Benz-E-Class",
                "Toyota-Camry",
                "Volvo-S40",
                "Ford-Taurus",
                "Daewoo-Nubira",
                "Toyota-Camry",
                "Jaguar-XJ Series",
                "Dodge-Ram 1500 Club",
                "Pontiac-Grand Prix",
                "Toyota-FJ Cruiser",
                "Saab-43711",
                "Chevrolet-Monte Carlo",
                "Ford-F-Series",
                "Mazda-B-Series",
                "GMC-Canyon",
                "GMC-Envoy XL",
                "Honda-Accord",
                "Ford-Escort",
                "Volvo-S60",
                "Saab-43711",
                "Volkswagen-Vanagon",
                "MG-MGB",
                "BMW-5 Series",
                "Chevrolet-Cavalier",
                "Pontiac-Turbo Firefly",
                "Chevrolet-Corvette",
                "Bentley-Continental",
                "Infiniti-G",
                "Pontiac-Aztek",
                "Dodge-Viper",
                "Nissan-Armada",
                "Lexus-RX",
                "Audi-S5",
                "Ford-Mustang",
                "Mercury-Sable",
                "Plymouth-Voyager",
                "Dodge-Ram Van B150",
                "Lexus-RX",
                "Audi-80",
                "GMC-Savana 2500",
                "Lexus-IS-F",
                "Volkswagen-New Beetle",
                "Volkswagen-Touareg",
                "Chevrolet-Silverado 1500",
                "Subaru-Impreza",
                "Toyota-Tacoma",
                "Jeep-Grand Cherokee",
                "Isuzu-i-280",
                "BMW-M6",
                "Mazda-Miata MX-5",
                "Mercedes-Benz-M-Class",
                "Mazda-B-Series",
                "Mazda-Familia",
                "Isuzu-Hombre Space",
                "Dodge-Nitro",
                "Nissan-Murano",
                "Toyota-Supra",
                "Mazda-626",
                "Dodge-Dakota Club",
                "Pontiac-Firefly",
                "Dodge-Caravan",
                "Chevrolet-Corvette",
                "Volkswagen-CC",
                "Audi-S5",
                "Mitsubishi-Sigma",
                "Hummer-H3",
                "Toyota-RAV4",
                "Jaguar-XK Series",
                "Honda-Prelude",
                "Aptera-Type-1h",
                "Nissan-Pathfinder",
                "Land Rover-Defender",
                "Ford-F350",
                "Lotus-Elise",
                "Mitsubishi-Challenger",
                "Buick-LaCrosse",
                "Ford-Ranger",
                "Ford-Aspire",
                "Ford-LTD Crown Victoria",
                "Chevrolet-Tahoe",
                "Ford-Focus",
                "Ford-Taurus",
                "Nissan-350Z",
                "Infiniti-QX56",
                "BMW-M5",
                "Mercury-Cougar",
                "Porsche-Cayman",
                "Saab-43711",
                "Lexus-LS",
                "Chevrolet-Express 1500",
                "Lamborghini-Diablo",
                "Aston Martin-Vantage",
                "Oldsmobile-Achieva",
                "Chrysler-Town & Country",
                "Audi-S4",
                "Volkswagen-Golf",
                "Lamborghini-Aventador",
                "Mazda-B-Series",
                "Mercury-Grand Marquis",
                "Porsche-928",
                "Ford-Mustang",
                "Honda-Odyssey",
                "Chrysler-Crossfire",
                "Lexus-RX Hybrid",
                "BMW-M6",
                "Mitsubishi-Challenger",
                "Subaru-Forester",
                "Acura-TSX",
                "Lexus-GS",
                "Bentley-Continental GTC",
                "Lincoln-Town Car",
                "Chrysler-Town & Country",
                "Chevrolet-Colorado"};

        int countToyota=0;

        for (String eachCar : cars) {
            if(eachCar.startsWith("Toyota")){
                countToyota++;
                }
        }

        int j=0;
        String[] toyotaInventory = new String[countToyota];
        for (int i=0 ; i<cars.length ; i++) {
            if(cars[i].startsWith("Toyota")){
                toyotaInventory[j]=cars[i];
                j++;
            }
        }
        System.out.println("Total Toyota Count is = "+countToyota);
        System.out.println("Toyota Inventory is = "+ Arrays.toString(toyotaInventory));

    }
}
