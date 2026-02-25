from datetime import date, datetime, timedelta


def parse_date(s: str):
	s = s.strip()
	for fmt in ("%Y-%m-%d", "%d/%m/%Y", "%d-%m-%Y"):
		try:
			return datetime.strptime(s, fmt).date()
		except ValueError:
			continue
	return None




