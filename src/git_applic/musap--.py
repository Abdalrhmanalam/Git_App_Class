print("hellooooooooooooooooooooooo")
from datetime import date, datetime, timedelta


def parse_date(s: str):
	s = s.strip()
	for fmt in ("%Y-%m-%d", "%d/%m/%Y", "%d-%m-%Y"):
		try:
			return datetime.strptime(s, fmt).date()
		except ValueError:
			continue
	return None


def calculate_age(birth: date, today: date | None = None):
	if today is None:
		today = date.today()
	years = today.year - birth.year
	months = today.month - birth.month
	days = today.day - birth.day

	if days < 0:
		prev_month = today.replace(day=1) - timedelta(days=1)
		days += prev_month.day
		months -= 1

	if months < 0:
		months += 12
		years -= 1

	return years, months, days


def main():
	prompt = "أدخل تاريخ ميلادك (YYYY-MM-DD أو DD/MM/YYYY أو DD-MM-YYYY): "
	while True:
		try:
			s = input(prompt)
		except EOFError:
			print()
			return
		bd = parse_date(s)
		if bd is None:
			print("صيغة غير صحيحة. الرجاء استخدام أحد الأنماط: YYYY-MM-DD أو DD/MM/YYYY أو DD-MM-YYYY")
			continue
		if bd > date.today():
			print("تاريخ الميلاد لا يمكن أن يكون في المستقبل. حاول مجددًا.")
			continue
		y, m, d = calculate_age(bd)
		total_days = (date.today() - bd).days
		print(f"عمرك: {y} سنة، {m} شهر، {d} يوم")
		print(f"إجمالي الأيام منذ الميلاد: {total_days} يوم")
		break


if __name__ == "__main__":
	main()




